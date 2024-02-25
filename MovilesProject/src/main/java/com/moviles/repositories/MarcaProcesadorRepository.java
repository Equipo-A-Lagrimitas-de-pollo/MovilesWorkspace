package com.moviles.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.MarcaProcesador;

@Repository
public interface MarcaProcesadorRepository extends JpaRepository<MarcaProcesador, Long>{
	public Optional<MarcaProcesador> findByMarca(String marca);
	
}
