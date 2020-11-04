package com.nanjolono.consumer8080.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: nanjolono-parent
 * @description: configuration
 * @author: nanjolono
 * @create: 2020-11-02 23:08
 **/
@Configuration
public class DepartCodeConfig {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
