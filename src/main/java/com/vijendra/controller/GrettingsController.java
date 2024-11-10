package com.vijendra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grettings")
public class GrettingsController {
	@GetMapping("/hi")
	public String sayHi()
	{
		return "Hi...dear";
	}
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "hello..dear";
	}
}
