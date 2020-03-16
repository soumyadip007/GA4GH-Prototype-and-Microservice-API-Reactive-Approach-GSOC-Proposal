package com.ga4gh.reactive.prototype;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ga4gh.reactive.prototype.entity.GA4GH;
import com.ga4gh.reactive.prototype.repository.GA4GHRepository;

@SpringBootApplication
public class Ga4GhReactiveApplication {

	
	@Bean
	CommandLineRunner addChromo(GA4GHRepository ga4ghRepository){
		return args -> {
			ga4ghRepository
					.deleteAll()
			.subscribe(null, null, () -> {

				Stream.of(new GA4GH(1,"A","A","A","A" ),
						new GA4GH(1,"B","B","B","B" ))
						.forEach(ga4gh -> {
					ga4ghRepository
						.save(ga4gh)
						.subscribe(System.out::println);
						});

			})
			;
		};	
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ga4GhReactiveApplication.class, args);
	}

}
