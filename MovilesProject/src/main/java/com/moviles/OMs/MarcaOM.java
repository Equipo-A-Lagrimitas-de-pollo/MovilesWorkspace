package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Marca;

public class MarcaOM {
	public static List<Marca> createMarca() {
		List<Marca> listaMarcas = new ArrayList<>();

		listaMarcas.add(new Marca("Iphone"));
		listaMarcas.add(new Marca("Samsung"));
		listaMarcas.add(new Marca("Huawei"));
		listaMarcas.add(new Marca("Xiaomi"));
		listaMarcas.add(new Marca("Sony"));
		listaMarcas.add(new Marca("LG"));

		return listaMarcas;
	}
}
