package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@ConfigurationProperties(prefix="person")
@ToString
@Data
public class Person {

	private String desc;
	
	private Dog dog;
}
