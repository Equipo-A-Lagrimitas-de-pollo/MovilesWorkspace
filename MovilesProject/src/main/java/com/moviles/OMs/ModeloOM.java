package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Marca;
import com.moviles.model.entity.Modelo;

public class ModeloOM {
	public static List<Modelo> createModelo() {
		List<Modelo> listaModelos = new ArrayList<>();
		listaModelos.add(new Modelo(new Marca("Iphone"), "14"));
		listaModelos.add(new Modelo(new Marca("Xiaomi"), "MiA2"));
		listaModelos.add(new Modelo(new Marca("Samsung"), "Galaxy"));
		listaModelos.add(new Modelo(new Marca("Sony"), "Xperia"));
		listaModelos.add(new Modelo(new Marca("Huawei"), "p30"));

		return listaModelos;
	}
}
