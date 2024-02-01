package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Procesador;

public class ProcesadorOM {
	public List<Procesador> createProcesador() {
		List<Procesador> listaProcesadores = new ArrayList<>();
		listaProcesadores.add(new Procesador(1l,"Intel Core i5", 4, 3.6));
		listaProcesadores.add(new Procesador(2l,"AMD Ryzen 7", 8, 4.2));
		listaProcesadores.add(new Procesador(3l,"Intel Core i9", 12, 5.0));
		listaProcesadores.add(new Procesador(4l,"AMD Ryzen 5", 6, 3.8));
		listaProcesadores.add(new Procesador(5l,"Intel Core i7", 8, 4.0));
		return listaProcesadores;
	}
}
