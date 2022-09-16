package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

@Order(1)
@Component
public class MySpringConsoleHelloWorldApplicationFirst implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("First");
	}
}