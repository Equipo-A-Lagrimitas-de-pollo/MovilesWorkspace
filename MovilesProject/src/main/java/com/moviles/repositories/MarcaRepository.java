package com.moviles.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.Marca;
import com.moviles.model.entity.Movil;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
