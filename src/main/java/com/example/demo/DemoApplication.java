package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{

	@RequestMapping("/")
	String hello() {

		return "Welcome To D4 Insight.";
	}

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
