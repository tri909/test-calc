package com.tri909.testcal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCalApplication {
	int sum(int a, int b) {
		return a + b;
	}	
	public static void main(String[] args) {
		SpringApplication.run(TestCalApplication.class, args);
	}

}
