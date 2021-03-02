package com.nanjolono.eureka8000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka8000Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka8000Application.class, args);
	}

}
