package com.nanjolono.eureka8000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka8100Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka8100Application.class, args);
	}

}
