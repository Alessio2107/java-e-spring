package com.example.demo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan({"com.example.demo.config",
	"com.example.demo.service"})
public class SpringBatchProvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchProvaApplication.class, args);
	}

}
