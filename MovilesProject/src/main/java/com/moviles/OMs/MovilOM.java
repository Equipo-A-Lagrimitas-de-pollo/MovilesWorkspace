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

		// Primer móvil
		listaMoviles.add(new Movil(new Modelo(new Marca("Iphone"), "14"), new Procesador("Intel Core i5", 4, 3.6),
				new TecnologiaPantalla("OLED"), 70.0, 8.0, 150.0, 6.5, 128, 6, 180.0, 48, true, 699.99, LocalDate.of(5,5,2020), 4));

		// Segundo móvil
		listaMoviles.add(new Movil(new Modelo(new Marca("Samsung"), "Galaxy S21"), new Procesador("Exynos 2100", 8, 2.9),
		                new TecnologiaPantalla("AMOLED"), 76.4, 7.8, 161.5, 6.2, 256, 8, 185.0, 64, true, 899.99, LocalDate.of(2021, 3, 15), 5));

		// Tercer móvil
		listaMoviles.add(new Movil(new Modelo(new Marca("Huawei"), "P40"), new Procesador("Kirin 990", 8, 2.86),
		                new TecnologiaPantalla("OLED"), 71.1, 8.5, 148.9, 6.1, 128, 8, 175.0, 50, true, 799.99, LocalDate.of(2020, 4, 10), 4));

		// Cuarto móvil
		listaMoviles.add(new Movil(new Modelo(new Marca("Google"), "Pixel 5"), new Procesador("Snapdragon 765G", 8, 2.4),
		                new TecnologiaPantalla("OLED"), 74.0, 8.0, 144.7, 6.0, 128, 8, 151.0, 12, true, 699.99, LocalDate.of(2020, 10, 15), 4));

		// Quinto móvil
		listaMoviles.add(new Movil(new Modelo(new Marca("OnePlus"), "9 Pro"), new Procesador("Snapdragon 888", 8, 2.84),
		                new TecnologiaPantalla("Fluid AMOLED"), 73.6, 8.7, 163.2, 6.7, 256, 12, 197.0, 64, true, 999.99, LocalDate.of(2021, 3, 23), 5));

		return listaMoviles;
	}
}
