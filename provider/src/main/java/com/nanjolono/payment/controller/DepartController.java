package com.nanjolono.payment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

/**
 * @program: nanjolono-parent
 * @description: departController
 * @author: nanjolono
 * @create: 2020-11-02 19:54
 **/
@RestController
@RequestMapping("/provider/depart")
public class DepartController {
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/discovery")
    public Object discoveryHandle(){
        List<String> services = client.getServices();
        for (String name: services) {
            List<ServiceInstance> instances = client.getInstances(name);
            for (ServiceInstance instance: instances) {
                String serviceId = instance.getServiceId();
                URI uri = instance.getUri();
                String host = instance.getHost();
                int port = instance.getPort();
                System.out.println(serviceId + ":" +  uri);
                System.out.println(host + ":" + port);
            }
        }
        return services;
    }


}
