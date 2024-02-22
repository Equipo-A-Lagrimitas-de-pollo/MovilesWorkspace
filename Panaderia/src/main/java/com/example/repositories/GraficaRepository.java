package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Grafica;

@Repository
public interface GraficaRepository extends JpaRepository<Grafica, Long> {

}
