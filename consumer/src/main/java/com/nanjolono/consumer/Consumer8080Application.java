package com.nanjolono.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker //开启熔断机制@Controller
@RequestMapping("discovery")
@Controller
@EnableDiscoveryClient
@EnableFeignClients
public class Consumer8080Application {

	public static void main(String[] args) {
		SpringApplication.run(Consumer8080Application.class, args);
	}


	@RestController
	public class TestController {

		private final RestTemplate restTemplate;

		@Autowired
		public TestController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

		@RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
		public String echo(@PathVariable String str) {
			return restTemplate.getForObject("http://authorization/echo/" + str, String.class);
		}
	}
}
