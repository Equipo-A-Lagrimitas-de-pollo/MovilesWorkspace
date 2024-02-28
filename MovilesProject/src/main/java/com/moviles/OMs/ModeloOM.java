package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Marca;
import com.moviles.model.entity.Modelo;

public class ModeloOM {
	public List<Modelo> createModelo() {
		List<Modelo> listaModelos = new ArrayList<>();
		listaModelos.add(new Modelo(new Marca("Iphone"), 1l, "14"));
		listaModelos.add(new Modelo(new Marca("Xiaomi"), 2l, "MiA2"));
		listaModelos.add(new Modelo(new Marca("Samsung"), 3l, "Galaxy"));
		listaModelos.add(new Modelo(new Marca("Sony"), 4l, "Xperia"));
		listaModelos.add(new Modelo(new Marca("Huawei"), 5l, "p30"));

		return listaModelos;
	}
}
