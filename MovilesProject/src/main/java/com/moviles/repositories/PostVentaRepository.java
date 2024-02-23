package com.moviles.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.moviles.model.entity.PostVenta;

public interface PostVentaRepository extends MongoRepository<PostVenta, String> {

}
