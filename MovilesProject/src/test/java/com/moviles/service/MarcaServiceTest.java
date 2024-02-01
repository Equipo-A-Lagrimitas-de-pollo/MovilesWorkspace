package com.moviles.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.MarcaOM;
import com.moviles.model.entity.Marca;

@SpringBootTest
class MarcaServiceTest {
	@Autowired
	private MarcaService marcaService;

	private static List<Marca> listaMarcas;

	@BeforeAll
	static void poblar(@Autowired MarcaService marcaService) {
		MarcaServiceTest.listaMarcas = new MarcaOM().createMarca();
		for (Marca marca : listaMarcas) {
			marcaService.save(marca);
		}
	}

	@Test
	void testUpdate() {
		Marca marca = listaMarcas.get(1);
		assertTrue(marcaService.update(marca));
	}
}
