package com.moviles.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.TecnologiaPantallaOM;
import com.moviles.model.entity.TecnologiaPantalla;

@SpringBootTest
class TecnologiaPantallaServiceTest {
	@Autowired
	private TecnologiaPantallaService tecnologiaPantallaService;

	private static List<TecnologiaPantalla> listaTecnologiaPantallaServices;

	@BeforeAll
	static void poblar(@Autowired TecnologiaPantallaService tecnologiaPantallaService) {
		listaTecnologiaPantallaServices = new TecnologiaPantallaOM().createTecnologiaPantalla();
		for (TecnologiaPantalla tecnologiaPantalla : listaTecnologiaPantallaServices) {
			tecnologiaPantallaService.save(tecnologiaPantalla);
		}
	}

	@Test
	void testUpdate() {
		TecnologiaPantalla tecnologiaPantalla = listaTecnologiaPantallaServices.get(1);
		assertTrue(tecnologiaPantallaService.update(tecnologiaPantalla));
	}

}
