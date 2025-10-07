package com.webflux.reactive.repository;

import com.webflux.reactive.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {
    Flux<Product> findByName(String name);
}
