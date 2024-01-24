package com.moviles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviles.model.entity.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {

}
