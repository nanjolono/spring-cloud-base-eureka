package com.nanjolono.provider8081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
public class Provider8081Application {

	public static void main(String[] args) {
		SpringApplication.run(Provider8081Application.class, args);
	}

}