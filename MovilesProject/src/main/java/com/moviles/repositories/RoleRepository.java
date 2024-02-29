package com.moviles.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.ERole;
import com.moviles.model.entity.RoleEntity;

@Repository
public interface RoleRepository extends MongoRepository<RoleEntity, Long> {

	public Optional<RoleEntity> findByName(ERole erole);
}