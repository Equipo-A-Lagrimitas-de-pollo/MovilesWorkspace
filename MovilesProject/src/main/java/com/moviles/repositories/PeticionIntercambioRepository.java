package com.moviles.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.moviles.model.entity.PeticionIntercambio;

/**
 * PeticionIntercambioRepository
 */

public interface PeticionIntercambioRepository extends MongoRepository<PeticionIntercambio, String> {

}