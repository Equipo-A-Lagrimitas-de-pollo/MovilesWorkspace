package com.example.OM;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Procesador;

public class ProcesadorOM {
	public static List<Procesador> getListaProcesadores() {
		List<Procesador> listaProcesadores = new ArrayList<>();
		listaProcesadores.add(new Procesador("InteL"));
		listaProcesadores.add(new Procesador("AMD"));
		return listaProcesadores;
	}
}
