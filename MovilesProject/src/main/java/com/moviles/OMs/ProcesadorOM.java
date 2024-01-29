package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Procesador;

public class ProcesadorOM {
	public static List<Procesador> createProcesador(String nombreProcesador, int numeroNucleos,
			double gigaHerziosMaximos) {
		List<Procesador> listaProcesadores = new ArrayList<>();
		Procesador procesador = new Procesador();
		listaProcesadores.add(procesador);
		return listaProcesadores;
	}
}
