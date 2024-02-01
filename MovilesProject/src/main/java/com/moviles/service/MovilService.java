package com.moviles.service;

import java.util.List;

import com.moviles.model.DTO.DTOMovil;
import com.moviles.model.DTO.DTORequestPuntuacion;
import com.moviles.model.DTO.DTOcompare;
import com.moviles.model.entity.MovilKey;

public interface MovilService extends DataService<DTOMovil, MovilKey> {

	public List<DTOMovil> filterByMarca(String marca);

	public boolean updatePuntuacion(DTORequestPuntuacion requestPuntuacion);

	public List<DTOMovil> findTopMovil();

	public List<DTOMovil> compareMovile(DTOcompare keys);
}
