package com.example.OM;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Grafica;

public class GraficaOM{
	
	public static List<Grafica> getListaGrafica(){
		List<Grafica> listaGraficas = new ArrayList<>();
		listaGraficas.add(new Grafica("nVidia", "3060Ti"));
		listaGraficas.add(new Grafica("AMD", "1000SinTi"));
		return listaGraficas;
	}
}
