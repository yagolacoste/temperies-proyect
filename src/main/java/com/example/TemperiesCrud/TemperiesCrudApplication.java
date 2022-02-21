package com.example.TemperiesCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="Controllers")
public class TemperiesCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperiesCrudApplication.class, args);
	}

}
