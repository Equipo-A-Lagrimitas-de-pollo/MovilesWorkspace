package com.moviles.service;

import java.util.List;

import com.moviles.model.entity.Movil;

public interface MovilService {
	public List<Movil> filterByMarca(String nombre);

	public List<Movil> filterByPrecioMin(float precioMin);

	public List<Movil> filterByPrecioMax(float precioMax);

	public List<Movil> filterByRamMin(int ramMin);

	public List<Movil> filterByRamMax(int ramMax);

	public List<Movil> filterByNFC(boolean nfc);

	public List<Movil> filterByTec(String tipo);
}
