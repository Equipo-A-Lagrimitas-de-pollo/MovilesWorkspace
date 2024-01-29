package com.moviles;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.model.entity.Modelo;
import com.moviles.model.entity.Movil;

@SpringBootTest
class TestFilterByPrecio {
	
	private List<Movil> listaMoviles;

    @BeforeEach
    void beforeEach() {
        listaMoviles = new ArrayList<>();

        // Crear y añadir el primer móvil
        Movil movil1 = new Movil(
                new Modelo(1L, new Marca("Marca1")),
                1L,
                new Procesador(1L, "Procesador1", 8, 2.5),
                new TecnologiaPantalla(1L, "Tecnologia1"),
                5.5,
                0.8,
                150.0,
                6.0,
                128,
                6,
                160.0,
                12,
                true,
                699.99,
                new Date()
        );
        listaMoviles.add(movil1);

        // Crear y añadir el segundo móvil
        Movil movil2 = new Movil(
                new Modelo(2L, new Marca("Marca2")),
                2L,
                new Procesador(2L, "Procesador2", 6, 2.8),
                new TecnologiaPantalla(2L, "Tecnologia2"),
                6.0,
                0.7,
                155.0,
                6.4,
                256,
                8,
                170.0,
                16,
                true,
                899.99,
                new Date()
        );
        listaMoviles.add(movil2);

        // Crear y añadir el tercer móvil
        Movil movil3 = new Movil(
                new Modelo(3L, new Marca("Marca3")),
                3L,
                new Procesador(3L, "Procesador3", 4, 2.2),
                new TecnologiaPantalla(3L, "Tecnologia3"),
                5.8,
                0.9,
                160.0,
                6.2,
                64,
                4,
                150.0,
                14,
                false,
                549.99,
                new Date()
        );
        listaMoviles.add(movil3);

        // Crear y añadir el cuarto móvil
        Movil movil4 = new Movil(
                new Modelo(4L, new Marca("Marca4")),
                4L,
                new Procesador(4L, "Procesador4", 4, 2.0),
                new TecnologiaPantalla(4L, "Tecnologia4"),
                5.2,
                0.6,
                145.0,
                5.5,
                32,
                3,
                140.0,
                10,
                false,
                399.99,
                new Date()
        );
        listaMoviles.add(movil4);

        // Crear y añadir el quinto móvil
        Movil movil5 = new Movil(
                new Modelo(5L, new Marca("Marca5")),
                5L,
                new Procesador(5L, "Procesador5", 12, 3.0),
                new TecnologiaPantalla(5L, "Tecnologia5"),
                6.5,
                0.8,
                165.0,
                6.7,
                512,
                12,
                180.0,
                20,
                true,
                1299.99,
                new Date()
        );
        listaMoviles.add(movil5);
    }
	
	@Test
	void test() {
	}

}
