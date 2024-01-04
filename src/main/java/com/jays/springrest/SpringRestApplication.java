package com.jays.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApplication {
	public static void main(String[] args) {


		System.setProperty("server.port", "3535");
		SpringApplication.run(SpringRestApplication.class, args);
	}
}
