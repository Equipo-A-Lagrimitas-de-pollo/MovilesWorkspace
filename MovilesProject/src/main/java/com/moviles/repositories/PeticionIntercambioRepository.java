package com.moviles.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.PeticionIntercambio;

/**
 * PeticionIntercambioRepository
 */

@Repository
public interface PeticionIntercambioRepository extends MongoRepository<PeticionIntercambio, ObjectId> {

}