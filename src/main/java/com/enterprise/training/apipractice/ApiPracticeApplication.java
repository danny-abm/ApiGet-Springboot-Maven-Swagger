package com.enterprise.training.apipractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages= {"com.enterprice.training.apipractice.controller"})
public class ApiPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPracticeApplication.class, args);
		
		System.out.println("Mi Primer Api en Java");
	}

}
