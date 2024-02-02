package com.moviles.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.moviles.model.entity.Procesador;

@Repository
public interface ProcesadorRepository extends JpaRepository<Procesador, Long > {

	public Optional<Procesador> findByNombre(String nombre);
	public void deleteByNombre(String nombre);
	
}
