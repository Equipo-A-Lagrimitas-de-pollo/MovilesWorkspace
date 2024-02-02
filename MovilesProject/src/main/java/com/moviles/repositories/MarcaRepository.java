package com.moviles.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
	public Optional<Marca> findByNombre(String nombre);
	public void deleteByNombre(String nombre);
}
