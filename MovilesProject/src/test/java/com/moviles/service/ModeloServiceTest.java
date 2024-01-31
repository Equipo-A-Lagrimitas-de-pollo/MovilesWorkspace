package com.moviles.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.ModeloOM;
import com.moviles.model.entity.Modelo;

@SpringBootTest
class ModeloServiceTest {
	@Autowired
	private ModeloService modeloService;
	
	private static List<Modelo> listaModelosServices;
	
	@BeforeAll
	static void poblar(@Autowired ModeloService modeloService) {
		listaModelosServices = new ModeloOM().createModelo();
		for (Modelo modelo : listaModelosServices) {
			modeloService.save(modelo);
		}
	}
	
	@Test
	void testUpdate() {
		Modelo modelo = listaModelosServices.get(1);
		assertTrue(modeloService.update(modelo));
	}

}
