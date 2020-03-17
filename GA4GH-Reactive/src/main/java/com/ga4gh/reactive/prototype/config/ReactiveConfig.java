package com.ga4gh.reactive.prototype.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import com.ga4gh.reactive.prototype.entity.GA4GH;
import com.ga4gh.reactive.prototype.handler.RouterHandler;
import com.ga4gh.reactive.prototype.repository.GA4GHRepository;

import reactor.core.publisher.Mono;


@Configuration
public class ReactiveConfig {


	@Autowired
	private GA4GHRepository GA4GHRepository;
	@Bean
	RouterFunction<?> routerFunction(RouterHandler routehandler){
	     return RouterFunctions
	   .route(RequestPredicates.GET("/rest/ga4gh/all"), routehandler::getAll)
	                .andRoute(RequestPredicates.GET("/rest/ga4gh/{id}"), routehandler::get)
	                .andRoute(RequestPredicates.POST("/person"),
	                	    request -> {
	                	        Mono<GA4GH> OBJ= (Mono<GA4GH>) request.bodyToMono(GA4GH.class);
	                	        return ResponseEntity.ok().build(GA4GHRepository.insert(OBJ));
	                	      })
	                ;
	}


	
	
}
