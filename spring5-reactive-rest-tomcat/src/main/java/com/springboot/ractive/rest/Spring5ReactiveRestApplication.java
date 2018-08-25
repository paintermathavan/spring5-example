package com.springboot.ractive.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.rest.controller")
public class Spring5ReactiveRestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Spring5ReactiveRestApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Spring5ReactiveRestApplication.class);
	}
}
