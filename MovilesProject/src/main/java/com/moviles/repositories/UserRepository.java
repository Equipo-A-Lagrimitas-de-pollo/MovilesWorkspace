package com.moviles.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByUsername(String username);

	void deleteByUsername(String username);
	// ByUsername(String username);

	// opcionalmente con query
	// @Query("select u from UserEntity u where u.username=?1")
	// Optional<UserEntity> getName(String username);
}