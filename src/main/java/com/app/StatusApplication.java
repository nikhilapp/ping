package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com","diff"})
public class StatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatusApplication.class, args);
	}
}
