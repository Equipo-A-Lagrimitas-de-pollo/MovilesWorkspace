package com.moviles.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.moviles.model.entity.PeticionIntercambio;

public interface PeticionVentaRepository extends MongoRepository<PeticionIntercambio, String> {

}
