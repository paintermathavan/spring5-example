package com.springboot.ractive.rest;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.springboot.rest.domain.Employee;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class EmployeeRouter {
	   @Bean
	    RouterFunction<ServerResponse> routerFunction() {
	        return route(GET("/all"), this::all);
	    }
	   
	   private Mono<ServerResponse> all(ServerRequest req) {
			log.info("all employee service is calling...");
			
			Employee  e1= new Employee();
			e1.setId(1001L);
			e1.setName("Painter Mathavan");
	        return ServerResponse.ok()
	                .body(Flux.just(e1), Employee.class);
	    }
}
