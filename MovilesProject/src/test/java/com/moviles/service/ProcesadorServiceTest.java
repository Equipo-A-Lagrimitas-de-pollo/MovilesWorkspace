package com.moviles.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.ProcesadorOM;
import com.moviles.model.entity.Procesador;

@SpringBootTest
class ProcesadorServiceTest {
	@Autowired
	private ProcesadorService procesadorService;

	private static List<Procesador> listaProcesadorServices;

	@BeforeAll
	static void poblar(@Autowired ProcesadorService procesadorService) {
		listaProcesadorServices = new ProcesadorOM().createProcesador();
		for (Procesador procesador : listaProcesadorServices) {
			procesadorService.save(procesador);
		}
	}

	@Test
	void testUpdate() {
		Procesador procesador = listaProcesadorServices.get(1);
		assertTrue(procesadorService.update(procesador));
	}

}
