package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Marca;
import com.moviles.model.entity.Modelo;

public class ModeloOM {
	public static List<Modelo> createModelo() {
		List<Modelo> listaModelos = new ArrayList<>();
		listaModelos.add(new Modelo(1l,new Marca("Iphone"), "14"));
		listaModelos.add(new Modelo(2l,new Marca("Xiaomi"), "MiA2"));
		listaModelos.add(new Modelo(3l,new Marca("Samsung"), "Galaxy"));
		listaModelos.add(new Modelo(4l,new Marca("Sony"), "Xperia"));
		listaModelos.add(new Modelo(5l,new Marca("Huawei"), "p30"));

		return listaModelos;
	}
}
