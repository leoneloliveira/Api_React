package com.exemplo.abrigosanimais.repository;

import com.exemplo.abrigosanimais.model.Adocao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdocaoRepository extends MongoRepository<Adocao, String> {}
