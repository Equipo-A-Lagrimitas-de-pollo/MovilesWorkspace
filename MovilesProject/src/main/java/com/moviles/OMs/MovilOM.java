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
	public static void createMovil(String[] args) {
		List<Movil> listaMoviles = new ArrayList<>();

		// Móvil 1
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 1L, "Modelo1"),
				new Procesador(1L, "ProcesadorX1", 8, 2.5), new TecnologiaPantalla(1L, "SuperAMOLED1"), 1L, 72.0, 8.5,
				160.0, 6.3, 256, 12, 200.0, 64, true, 799.99, LocalDate.of(2022, 1, 30).minusMonths(1), 5));

		// Móvil 2
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 2L, "Modelo2"),
				new Procesador(2L, "ProcesadorX2", 8, 2.6), new TecnologiaPantalla(2L, "SuperAMOLED2"), 2L, 73.0, 8.4,
				165.0, 6.4, 272, 13, 210.0, 68, true, 849.99, LocalDate.of(2022, 1, 29).minusMonths(2), 6));

		// Móvil 3
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 3L, "Modelo3"),
				new Procesador(3L, "ProcesadorX3", 8, 2.7), new TecnologiaPantalla(3L, "SuperAMOLED3"), 3L, 74.0, 8.3,
				170.0, 6.5, 288, 14, 220.0, 128, false, 899.99, LocalDate.of(2022, 1, 28).minusMonths(3), 7));

		// Móvil 4
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 4L, "Modelo4"),
				new Procesador(4L, "ProcesadorX4", 8, 2.8), new TecnologiaPantalla(4L, "SuperAMOLED4"), 4L, 75.0, 8.2,
				175.0, 6.6, 304, 15, 230.0, 256, true, 999.99, LocalDate.of(2022, 1, 27).minusMonths(4), 8));

		// Móvil 5
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 5L, "Modelo5"),
				new Procesador(5L, "ProcesadorX5", 8, 2.9), new TecnologiaPantalla(5L, "SuperAMOLED5"), 5L, 76.0, 8.1,
				180.0, 6.7, 320, 16, 240.0, 512, false, 1099.99, LocalDate.of(2022, 1, 26).minusMonths(5), 9));

		// Móvil 6
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 6L, "Modelo6"),
				new Procesador(6L, "ProcesadorX6", 8, 3.0), new TecnologiaPantalla(6L, "SuperAMOLED6"), 6L, 77.0, 8.0,
				185.0, 6.8, 336, 17, 250.0, 1024, true, 1199.99, LocalDate.of(2022, 1, 25).minusMonths(6), 10));

		// Móvil 7
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 7L, "Modelo7"),
				new Procesador(7L, "ProcesadorX7", 8, 3.1), new TecnologiaPantalla(7L, "SuperAMOLED7"), 7L, 78.0, 7.9,
				190.0, 6.9, 352, 18, 260.0, 2048, false, 1299.99, LocalDate.of(2022, 1, 24).minusMonths(7), 11));

		// Móvil 8
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 8L, "Modelo8"),
				new Procesador(8L, "ProcesadorX8", 8, 3.2), new TecnologiaPantalla(8L, "SuperAMOLED8"), 8L, 79.0, 7.8,
				195.0, 7.0, 368, 19, 270.0, 4096, true, 1399.99, LocalDate.of(2022, 1, 23).minusMonths(8), 12));

		// Móvil 9
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 9L, "Modelo9"),
				new Procesador(9L, "ProcesadorX9", 8, 3.3), new TecnologiaPantalla(9L, "SuperAMOLED9"), 9L, 80.0, 7.7,
				200.0, 7.1, 384, 20, 280.0, 8192, false, 1499.99, LocalDate.of(2022, 1, 22).minusMonths(9), 13));

		// Móvil 10
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 10L, "Modelo10"),
				new Procesador(10L, "ProcesadorX10", 8, 3.4), new TecnologiaPantalla(10L, "SuperAMOLED10"), 10L, 81.0,
				7.6, 205.0, 7.2, 400, 21, 290.0, 16384, true, 1599.99, LocalDate.of(2022, 1, 21).minusMonths(10), 14));

		// Móvil 11
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 11L, "Modelo11"),
				new Procesador(11L, "ProcesadorX11", 8, 3.5), new TecnologiaPantalla(11L, "SuperAMOLED11"), 11L, 82.0,
				7.5, 210.0, 7.3, 416, 22, 300.0, 32768, false, 1699.99, LocalDate.of(2022, 1, 20).minusMonths(11), 15));

		// Móvil 12
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 12L, "Modelo12"),
				new Procesador(12L, "ProcesadorX12", 8, 3.6), new TecnologiaPantalla(12L, "SuperAMOLED12"), 12L, 83.0,
				7.4, 215.0, 7.4, 432, 23, 310.0, 65536, true, 1799.99, LocalDate.of(2022, 1, 19).minusMonths(12), 16));

		// Móvil 13
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 13L, "Modelo13"),
				new Procesador(13L, "ProcesadorX13", 8, 3.7), new TecnologiaPantalla(13L, "SuperAMOLED13"), 13L, 84.0,
				7.3, 220.0, 7.5, 448, 24, 320.0, 131072, false, 1899.99, LocalDate.of(2022, 1, 18).minusMonths(13),
				17));

		// Móvil 14
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 14L, "Modelo14"),
				new Procesador(14L, "ProcesadorX14", 8, 3.8), new TecnologiaPantalla(14L, "SuperAMOLED14"), 14L, 85.0,
				7.2, 225.0, 7.6, 464, 25, 330.0, 262144, true, 1999.99, LocalDate.of(2022, 1, 17).minusMonths(14), 18));

		// Móvil 15
		listaMoviles.add(new Movil(new Modelo(new Marca("InventoCorp"), 15L, "Modelo15"),
				new Procesador(15L, "ProcesadorX15", 8, 3.9), new TecnologiaPantalla(15L, "SuperAMOLED15"), 15L, 86.0,
				7.1, 230.0, 7.7, 480, 26, 340.0, 524288, false, 2099.99, LocalDate.of(2022, 1, 16).minusMonths(15),
				19));

	}
}
