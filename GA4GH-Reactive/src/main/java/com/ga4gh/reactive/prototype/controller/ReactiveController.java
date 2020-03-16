package com.ga4gh.reactive.prototype.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ga4gh.reactive.prototype.entity.GA4GH;
import com.ga4gh.reactive.prototype.repository.GA4GHRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ga4gh")
public class ReactiveController {

	private GA4GHRepository GA4GHRepository;

	@GetMapping("/flux")
	public Flux<GA4GH> ga4ghFlux()
	{
		
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		return this.GA4GHRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<GA4GH> ga4ghID(@PathVariable final int i)
	{
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		System.out.println("ga4gh");
		return this.GA4GHRepository.findById(i);
	}
	
}
