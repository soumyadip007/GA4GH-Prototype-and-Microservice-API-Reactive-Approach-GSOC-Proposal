package com.ga4gh.reactive.prototype.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import com.ga4gh.reactive.prototype.handler.RouterHandler;


@Configuration
public class ReactiveConfig {

	@Bean
	RouterFunction<?> routerFunction(RouterHandler routehandler){
	     return RouterFunctions
	   .route(RequestPredicates.GET("/rest/ga4gh/all"), routehandler::getAll)
	                .andRoute(RequestPredicates.GET("/rest/ga4gh/{id}"), routehandler::get)
				;
		
	}
}
