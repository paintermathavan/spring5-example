package com.springboot.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.domain.Employee;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
public class EmployeeController {

	@GetMapping("/all/employees")
	public Flux<Employee> all(){
		log.info("all employee service is calling...");
		
		Employee  e1= new Employee();
		e1.setId(1001L);
		e1.setName("Krish");
		return Flux.just(e1);
	}
	
}
