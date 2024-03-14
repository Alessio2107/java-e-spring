package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorsiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorsiApplication.class, args);
		System.out.println("SONO IN ASCOLTO!");
	}

}
