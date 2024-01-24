package com.moviles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.moviles.model.entity.Movil;
import com.moviles.model.entity.MovilKey;

public interface MovilRepository extends JpaRepository<Movil, MovilKey>{
	
}
