package com.moviles.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.moviles.model.entity.PeticionIntercambio;

public interface PeticionVentaRepository extends MongoRepository<PeticionIntercambio, ObjectId> {

}
