package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Application 
{
	public static void main(String[] args) 
	{
		System.out.println("inside the application class before the method calling ");
		SpringApplication.run(Application.class,args);
	}
}
