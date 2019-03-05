package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
       //你快乐吗？
	@ResponseBody
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello World!";
	}
}
