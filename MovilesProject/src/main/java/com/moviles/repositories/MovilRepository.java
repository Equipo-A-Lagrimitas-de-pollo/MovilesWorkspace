package com.moviles.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviles.model.entity.Movil;
import com.moviles.model.entity.MovilKey;

@Repository
public interface MovilRepository extends JpaRepository<Movil, MovilKey> {

    public List<Movil> findTop5ByOrderByPuntuacionDesc();

}
