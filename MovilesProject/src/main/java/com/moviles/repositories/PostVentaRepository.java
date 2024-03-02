package com.moviles.repositories;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.PostVenta;

@Repository
public interface PostVentaRepository extends MongoRepository<PostVenta, ObjectId> {

    public Optional<PostVenta> findByReferencia(Long referencia);
}
