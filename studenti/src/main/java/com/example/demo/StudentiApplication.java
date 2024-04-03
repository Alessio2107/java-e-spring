package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentiApplication.class, args);
		System.out.println("Sono in ascolto...");
	}

}
