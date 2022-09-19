package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

@Order(3)
@Component
public class MySpringConsoleHelloWorldApplicationSecond implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Second");
	}
}