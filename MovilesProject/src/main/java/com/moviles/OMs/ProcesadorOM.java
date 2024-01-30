package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Procesador;

public class ProcesadorOM {
	public static List<Procesador> createProcesador() {
		List<Procesador> listaProcesadores = new ArrayList<>();
		listaProcesadores.add(new Procesador("Intel Core i5", 4, 3.6));
		listaProcesadores.add(new Procesador("AMD Ryzen 7", 8, 4.2));
		listaProcesadores.add(new Procesador("Intel Core i9", 12, 5.0));
		listaProcesadores.add(new Procesador("AMD Ryzen 5", 6, 3.8));
		listaProcesadores.add(new Procesador("Intel Core i7", 8, 4.0));
		return listaProcesadores;
	}
}
