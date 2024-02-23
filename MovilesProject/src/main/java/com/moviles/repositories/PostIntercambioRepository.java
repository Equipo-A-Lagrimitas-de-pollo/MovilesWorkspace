package com.moviles.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.moviles.model.entity.PostIntercambio;

public interface PostIntercambioRepository extends MongoRepository<PostIntercambio, String> {

}
