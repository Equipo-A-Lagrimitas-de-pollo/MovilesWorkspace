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

		listaMoviles.add(new Movil(
                new Modelo(1L, new Marca(1L, "InventoCorp"), "Modelo1"),
                1L,
                new Procesador(1L, "ProcesadorX1", 8, 2.5),
                new TecnologiaPantalla(1L, "SuperAMOLED1"),
                72.0, 8.5, 160.0, 6.3, 256, 12, 200.0, 64, true,
                799.99, LocalDate.of(2022, 1, 30).minusMonths(1), 5));

        listaMoviles.add(new Movil(
                new Modelo(2L, new Marca(2L, "FuturisticTech"), "Modelo2"),
                2L,
                new Procesador(2L, "QuantumProcessor2", 10, 2.8),
                new TecnologiaPantalla(2L, "QuantumDisplay2"),
                75.0, 8.2, 165.0, 6.7, 512, 16, 250.0, 108, false,
                1299.99, LocalDate.of(2022, 1, 30).minusMonths(2), 5));

        listaMoviles.add(new Movil(
                new Modelo(3L, new Marca(3L, "TechInnovate"), "Modelo3"),
                3L,
                new Procesador(3L, "HyperSpeed3", 10, 2.8),
                new TecnologiaPantalla(3L, "QuantumLED3"),
                71.5, 8.8, 155.0, 6.1, 128, 8, 190.0, 64, true,
                899.99, LocalDate.of(2022, 1, 30).minusMonths(3), 4));

        listaMoviles.add(new Movil(
                new Modelo(4L, new Marca(4L, "FutureGadget"), "Modelo4"),
                4L,
                new Procesador(4L, "NeuralChip4", 6, 2.2),
                new TecnologiaPantalla(4L, "QuantumHD4"),
                70.8, 8.4, 158.0, 6.4, 256, 12, 210.0, 48, true,
                1099.99, LocalDate.of(2022, 1, 30).minusMonths(4), 5));

        listaMoviles.add(new Movil(
                new Modelo(5L, new Marca(5L, "BeyondInnovations"), "Modelo5"),
                5L,
                new Procesador(5L, "NeuralFusion5", 12, 3.0),
                new TecnologiaPantalla(5L, "QuantumInfinity5"),
                73.0, 8.7, 170.0, 6.5, 512, 16, 220.0, 128, true,
                1499.99, LocalDate.of(2022, 1, 30).minusMonths(5), 5));

        listaMoviles.add(new Movil(
                new Modelo(6L, new Marca(6L, "InnovateX"), "Modelo6"),
                6L,
                new Procesador(6L, "QuantumElite6", 8, 2.5),
                new TecnologiaPantalla(6L, "QuantumVision6"),
                74.5, 8.0, 163.0, 6.2, 256, 12, 215.0, 64, false,
                1199.99, LocalDate.of(2022, 1, 30).minusMonths(6), 4));

        listaMoviles.add(new Movil(
                new Modelo(7L, new Marca(7L, "FutureInnovations"), "Modelo7"),
                7L,
                new Procesador(7L, "NeuralFusion7", 12, 3.2),
                new TecnologiaPantalla(7L, "QuantumPro7"),
                75.0, 8.2, 168.0, 6.8, 512, 16, 230.0, 256, true,
                1699.99, LocalDate.of(2022, 1, 30).minusMonths(7), 5));

        listaMoviles.add(new Movil(
                new Modelo(8L, new Marca(8L, "InnovationTech"), "Modelo8"),
                8L,
                new Procesador(8L, "QuantumX8", 10, 2.8),
                new TecnologiaPantalla(8L, "QuantumDisplayX8"),
                73.5, 8.6, 165.5, 6.7, 512, 16, 240.0, 128, true,
                1599.99, LocalDate.of(2022, 1, 30).minusMonths(8), 4));

        listaMoviles.add(new Movil(
                new Modelo(9L, new Marca(9L, "FuturoTech"), "Modelo9"),
                9L,
                new Procesador(9L, "QuantumCore9", 8, 2.5),
                new TecnologiaPantalla(9L, "QuantumInfinity9"),
                72.5, 8.8, 162.0, 6.4, 256, 12, 210.0, 128, false,
                1299.99, LocalDate.of(2022, 1, 30).minusMonths(9), 5));

        listaMoviles.add(new Movil(
                new Modelo(10L, new Marca(10L, "NextInnovations"), "Modelo10"),
                10L,
                new Procesador(10L, "NeuralElite10", 12, 3.0),
                new TecnologiaPantalla(10L, "QuantumDisplay10"),
                74.0, 8.5, 165.0, 6.6, 512, 16, 250.0, 256, true,
                1799.99, LocalDate.of(2022, 1, 30).minusMonths(10), 5));

		return listaMoviles;
	}
}
