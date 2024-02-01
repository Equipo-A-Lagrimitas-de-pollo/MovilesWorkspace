package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.TecnologiaPantalla;

public class TecnologiaPantallaOM {
	public List<TecnologiaPantalla> createTecnologiaPantalla() {
		List<TecnologiaPantalla> listaTecnologiasPantalla = new ArrayList<>();
		listaTecnologiasPantalla.add(new TecnologiaPantalla(1l,"OLED"));
		listaTecnologiasPantalla.add(new TecnologiaPantalla(2l,"LCD"));
		listaTecnologiasPantalla.add(new TecnologiaPantalla(3l,"AMOLED"));
		listaTecnologiasPantalla.add(new TecnologiaPantalla(4l,"IPS"));
		listaTecnologiasPantalla.add(new TecnologiaPantalla(5l,"Retina Display"));
		return listaTecnologiasPantalla;
	}
}
