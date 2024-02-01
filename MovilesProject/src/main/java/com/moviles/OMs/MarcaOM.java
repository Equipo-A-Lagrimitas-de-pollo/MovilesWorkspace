package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Marca;

public class MarcaOM {
	public List<Marca> createMarca() {
		List<Marca> listaMarcas = new ArrayList<>();

		listaMarcas.add(new Marca(1l,"Iphone"));
		listaMarcas.add(new Marca(2l,"Samsung"));
		listaMarcas.add(new Marca(3l,"Huawei"));
		listaMarcas.add(new Marca(4l,"Xiaomi"));
		listaMarcas.add(new Marca(5l,"Sony"));
		listaMarcas.add(new Marca(6l,"LG"));

		return listaMarcas;
	}
}
