package com.moviles.repositories;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.PeticionIntercambio;
import com.moviles.model.entity.PeticionVenta;

@Repository
public interface PeticionVentaRepository extends MongoRepository<PeticionVenta, ObjectId> {
	Optional<PeticionVenta> findByReferencia(String referencia);
}
