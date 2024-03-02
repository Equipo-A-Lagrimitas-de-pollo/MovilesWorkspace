package com.moviles.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.ERole;
import com.moviles.model.entity.RoleEntity;

@Repository
public interface RoleRepository extends MongoRepository<RoleEntity, String> {

	public List<RoleEntity> findByName(ERole erole);
}