package com.ga4gh.reactive.prototype.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ga4gh.reactive.prototype.entity.GA4GH;
import com.ga4gh.reactive.prototype.repository.GA4GHRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ga4gh")
public class FluxController {

	private GA4GHRepository GA4GHRepository;

	@GetMapping("/flux")
	public Flux<GA4GH> ga4ghFlux()
	{
		return this.GA4GHRepository.findAll();
	}
	
}
