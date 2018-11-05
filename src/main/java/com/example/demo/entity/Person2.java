package com.example.demo.entity;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
//@ConfigurationProperties(prefix="person")
@PropertySource(value= {"classpath:person2.properties"})
@ToString
@Data
public class Person2 {

	private String desc;
	
	private Dog dog;
}
