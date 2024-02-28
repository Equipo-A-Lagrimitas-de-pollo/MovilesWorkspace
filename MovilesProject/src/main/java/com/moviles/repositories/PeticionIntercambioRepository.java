package com.moviles.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.moviles.model.entity.PeticionIntercambio;

/**
 * PeticionIntercambioRepository
 */

public interface PeticionIntercambioRepository extends MongoRepository<PeticionIntercambio, ObjectId> {

}