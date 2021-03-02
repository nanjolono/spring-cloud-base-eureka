package com.nanjolono.auth;

import com.nanjolono.auth.utils.UserContextInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@EnableZuulProxy //开启zuul代理模式
@SpringCloudApplication
public class GateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(
				GateWayApplication.class, args);
	}

	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
		if(interceptors==null){
			restTemplate.setInterceptors(Collections
					.singletonList(
							new UserContextInterceptor()));
		}else{
			interceptors.add(new UserContextInterceptor());
			restTemplate.setInterceptors(interceptors);
		}
		return restTemplate;
	}
}
