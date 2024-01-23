package com.moviles.service;

import java.util.List;

import com.moviles.model.entity.Movil;

public interface MovilService {
	public List<Movil> filterByMarca(String nombre);
}
