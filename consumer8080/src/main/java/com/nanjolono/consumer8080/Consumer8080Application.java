package com.nanjolono.consumer8080;

import com.nanjolono.consumer8080.Rule.CustomRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@EnableFeignClients(basePackages = "com.nanjolono.consumer8080.service")
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker //开启熔断机制
public class Consumer8080Application {

	public static void main(String[] args) {
		SpringApplication.run(Consumer8080Application.class, args);
	}

	@Bean
	public IRule loadBalanceRule(){
		//指定Ribbo使用随机算法策略
		return new RandomRule();
		//自定义算法策略
/*		List<Integer> ports = new ArrayList<>();
		ports.add(8081);*/
		//return new CustomRule(ports);
	}
}
