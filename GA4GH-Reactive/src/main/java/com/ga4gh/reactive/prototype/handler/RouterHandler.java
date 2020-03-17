package com.ga4gh.reactive.prototype.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.ga4gh.reactive.prototype.entity.GA4GH;
import com.ga4gh.reactive.prototype.repository.GA4GHRepository;

import reactor.core.publisher.Mono;

@Component
public class RouterHandler {
	
	@Autowired
	private GA4GHRepository GA4GHRepository;
	
	public Mono<ServerResponse> getAll(ServerRequest serverRequest){
			
			return ServerResponse
					.ok()
					.body(GA4GHRepository.findAll(),GA4GH.class);
					
		}

	public Mono<ServerResponse> get(ServerRequest serverRequest){
		
		String j=serverRequest.pathVariable("id");
		
		int i=Integer.parseInt(j);
		
		return ServerResponse
				.ok()
				.body(GA4GHRepository.findById(i),GA4GH.class);
				
	}
	
	public Mono<ServerResponse> save(ServerRequest serverRequest){
		
		String j=serverRequest.pathVariable("id");
		
		int i=Integer.parseInt(j);
		
		return ServerResponse
				.ok()
				.body(GA4GHRepository.findById(i),GA4GH.class);
				
	}

}
