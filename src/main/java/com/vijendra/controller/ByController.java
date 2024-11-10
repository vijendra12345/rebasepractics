package com.vijendra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/by")
public class ByController {

	@GetMapping("/tata")
	public String sayTata()
	{

		return "Tata...dear and user";

	

	}
	
	@GetMapping("/gn")
	public String sayGN()
	{

		return "Good Night..dear and user";

		

	}
}
