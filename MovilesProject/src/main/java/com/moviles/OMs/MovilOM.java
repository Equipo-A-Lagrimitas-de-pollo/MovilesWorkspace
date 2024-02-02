package com.moviles.OMs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Marca;
import com.moviles.model.entity.Modelo;
import com.moviles.model.entity.Movil;
import com.moviles.model.entity.Procesador;
import com.moviles.model.entity.TecnologiaPantalla;

public class MovilOM {
	public static List<Movil> createMovil() {
		List<Movil> listaMoviles = new ArrayList<>();

		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 1L, "Modelo1"),
				new Procesador(1L, "ProcesadorX1", 8, 2.5), new TecnologiaPantalla(1L, "SuperAMOLED1"), 1L, 72.0, 8.5,
				160.0, 6.3, 256, 12, 200.0, 64, true, 799.99, LocalDate.of(2022, 1, 30).minusMonths(1), 5));

		return listaMoviles;
	}
}
