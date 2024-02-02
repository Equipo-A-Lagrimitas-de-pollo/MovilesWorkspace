package com.moviles.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.Marca;
import com.moviles.model.entity.TecnologiaPantalla;

@Repository
public interface TecnologiaPantallaRepository extends JpaRepository<TecnologiaPantalla, Long> {
	public Optional<TecnologiaPantalla> findByTipo(String tipo);
	public void deleteByTipo(String tipo);
}
