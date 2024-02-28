package com.moviles.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.PostIntercambio;

@Repository
public interface PostIntercambioRepository extends MongoRepository<PostIntercambio, ObjectId> {

}
