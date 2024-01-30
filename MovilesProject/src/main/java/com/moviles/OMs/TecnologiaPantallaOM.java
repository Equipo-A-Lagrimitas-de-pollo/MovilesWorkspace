package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.TecnologiaPantalla;

public class TecnologiaPantallaOM {
	public static List<TecnologiaPantalla> createTecnologiaPantalla() {
		List<TecnologiaPantalla> listaTecnologiasPantalla = new ArrayList<>();

		listaTecnologiasPantalla.add(new TecnologiaPantalla("OLED"));
		listaTecnologiasPantalla.add(new TecnologiaPantalla("LCD"));
		listaTecnologiasPantalla.add(new TecnologiaPantalla("AMOLED"));
		listaTecnologiasPantalla.add(new TecnologiaPantalla("IPS"));
		listaTecnologiasPantalla.add(new TecnologiaPantalla("Retina Display"));
		return listaTecnologiasPantalla;
	}
}
