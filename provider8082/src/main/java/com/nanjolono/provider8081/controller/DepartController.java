package com.nanjolono.provider8081.controller;

import com.nanjolono.provider8081.bean.Depart;
import com.nanjolono.provider8081.service.impl.DepartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

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
    private DepartServiceImpl service;
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
    @PostMapping("/save")
    public boolean saveHandle(@RequestBody Depart depart){
        depart.setDbase("test02");
        return service.saveDepart(depart);
    }

    @DeleteMapping("/del/{id}")
    public boolean removeHandle(@PathVariable("id") int id){
        return service.removeDepartById(id);
    }

    @PutMapping("/update")
    public boolean modifyHandle(@RequestBody Depart depart){
        depart.setDbase("test02");
        return service.modifyDepart(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getDepartHandle(@PathVariable("id") int id){
        return service.getDepartById(id);
    }

    @GetMapping("list")
    public List<Depart> listAllDepartsHandle(){
        return service.listAllDeparts();
    }
}
