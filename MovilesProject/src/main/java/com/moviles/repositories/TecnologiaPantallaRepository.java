package com.moviles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.TecnologiaPantalla;

@Repository
public interface TecnologiaPantallaRepository extends JpaRepository<TecnologiaPantalla, Long> {

}
