package com.exemplo.abrigosanimais.repository;

import com.exemplo.abrigosanimais.model.Abrigo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AbrigoRepository extends MongoRepository<Abrigo, String> {}


