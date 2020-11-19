package com.nanjolono.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Authentication {

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("password2"));
		SpringApplication.run(Authentication.class, args);
	}

}
