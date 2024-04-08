package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestWarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestWarApplication.class, args);
		System.out.println("This Project refers jenkins deployment");
	}

}
