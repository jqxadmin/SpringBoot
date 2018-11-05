package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.HelloService;

@Configuration
public class HelloConfig {

	@Bean
	public HelloService helloService() {
		System.out.println("添加bean组件.....helloService");
		return new HelloService();
	}
}
