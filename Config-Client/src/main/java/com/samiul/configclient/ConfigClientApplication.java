package com.samiul.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {
	

	public static void main(String[] args) {
		
		SpringApplication.run(ConfigClientApplication.class, args);
		//System.out.println("name is " + name);
	}

}
