package com.samiul.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${author.name}")
	private  String name;
	
	@GetMapping("/hello")
	public String sayHello() {
		return name;
	}
}
