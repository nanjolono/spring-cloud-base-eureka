package com.nanjolono.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //开启zuul代理模式
@SpringCloudApplication
public class GateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(
				GateWayApplication.class, args);
	}

}
