package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Procesador;

public class ProcesadorOM {
	public static List<Procesador> createProcesador() {
		List<Procesador> listaProcesadores = new ArrayList<>();
		listaProcesadores.add(new Procesador(nombreProcesador, numeroNucleos, gigaHerziosMaximos));
		return listaProcesadores;
	}
}
