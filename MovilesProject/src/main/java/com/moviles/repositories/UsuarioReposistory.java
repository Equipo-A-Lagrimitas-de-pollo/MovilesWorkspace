package com.moviles.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.Usuario;

@Repository
public interface UsuarioReposistory extends MongoRepository<Usuario, Long>{

}
