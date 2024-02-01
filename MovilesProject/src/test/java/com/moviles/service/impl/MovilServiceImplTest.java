package com.moviles.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.MovilOM;
import com.moviles.model.DTO.DTOMovilFilter;
import com.moviles.model.entity.Movil;
@SpringBootTest
class MovilServiceImplTest {

	@Autowired
	MovilServiceImpl movilServiceImpl;
	
	@Test
	void testFilter() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		DTOMovilFilter dtoMovilFilter = new DTOMovilFilter("InventoCorp", 900.0, 1200.0, 0, 0, null, null);
		List<Movil> listaMovilFiltrada = movilServiceImpl.filter(dtoMovilFilter);
		assertEquals(listaMovilFiltrada.size(), 2);
	}

}
