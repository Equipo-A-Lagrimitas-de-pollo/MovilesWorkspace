package com.moviles.service;

import java.util.List;

import com.moviles.model.DTO.DTORequestPuntuacion;
import com.moviles.model.DTO.DTOcompare;
import com.moviles.model.entity.Movil;
import com.moviles.model.entity.MovilKey;

public interface MovilService extends DataService<Movil, MovilKey> {

	public List<Movil> filterByMarca(Long marcaId);

	public boolean updatePuntuacion(DTORequestPuntuacion requestPuntuacion);

	public List<Movil> findTopMovil();

	public List<Movil> compareMovile(DTOcompare keys);
}
