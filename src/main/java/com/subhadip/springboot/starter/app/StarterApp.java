package com.subhadip.springboot.starter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.subhadip.springboot.starter")
@SpringBootApplication
public class StarterApp {
	public static void main(String[] args) {
		SpringApplication.run(StarterApp.class, args);
	}
}
