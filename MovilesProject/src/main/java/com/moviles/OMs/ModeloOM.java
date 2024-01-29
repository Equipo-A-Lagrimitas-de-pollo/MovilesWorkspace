package com.moviles.OMs;

import com.moviles.model.entity.Marca;
import com.moviles.model.entity.Modelo;

public class ModeloOM {
	public static Modelo createModelo(String nombreModelo,Marca marca) {
		Modelo modelo = new Modelo();
		modelo.setMarca(marca);
		return modelo;
	}
}
