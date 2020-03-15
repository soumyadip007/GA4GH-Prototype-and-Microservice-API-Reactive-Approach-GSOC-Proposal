package com.ga4gh.reactive.prototype.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ga4gh.reactive.prototype.entity.GA4GH;

//@Repository("GA4GHRepository")
public interface GA4GHRepository extends ReactiveMongoRepository<GA4GH, Integer> {

}
