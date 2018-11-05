package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Person;
import com.example.demo.entity.Person2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private Person person;
	
	@Autowired
	private Person2 person2;
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void testPerson2() {
		System.out.println(person2);
	}
	
	@Test
	public void contextLoads() {
		System.out.println(person);
	}

	@Test
	public void ApplicationTest() {
		boolean bl = context.containsBean("helloService");
		System.out.println(bl+".............");
	}
}
