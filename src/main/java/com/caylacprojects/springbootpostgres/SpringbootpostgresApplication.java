package com.caylacprojects.springbootpostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.caylacprojects") // Adjust if necessary to match your exact package structure
public class SpringbootpostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpostgresApplication.class, args);
	}
}
