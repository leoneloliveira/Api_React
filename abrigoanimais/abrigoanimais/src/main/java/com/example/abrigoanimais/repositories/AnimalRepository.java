package com.exemplo.abrigosanimais.repository;

import com.exemplo.abrigosanimais.model.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnimalRepository extends MongoRepository<Animal, String> {}
