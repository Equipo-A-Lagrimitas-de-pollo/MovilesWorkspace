package com.moviles.filterV2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;

class FilterByTecTest {

	@Test
	void testFilterByTec() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		FilterByTec filterByTec = new FilterByTec(3L);
		List<Movil> listaMovilesFiltrada = listaMoviles.stream().filter(movil->filterByTec.filter(movil)).toList();
		assertEquals(listaMovilesFiltrada.size(), 1);
	}

}
