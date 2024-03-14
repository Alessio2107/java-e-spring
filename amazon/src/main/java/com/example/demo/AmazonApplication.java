package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonApplication.class, args);
		System.out.println("Lo vedi che va?");
	}

}
