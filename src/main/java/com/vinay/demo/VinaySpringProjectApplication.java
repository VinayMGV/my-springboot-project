package com.vinay.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class VinaySpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(VinaySpringProjectApplication.class, args);
	}

}
