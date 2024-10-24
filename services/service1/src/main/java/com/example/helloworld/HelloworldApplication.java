package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldApplication {

	@Value("${NAME:World}")
	String name;

	@RestController
	static class HelloworldController {
		@GetMapping("/")
		String hello() {
		return "Hello Service1!";
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
