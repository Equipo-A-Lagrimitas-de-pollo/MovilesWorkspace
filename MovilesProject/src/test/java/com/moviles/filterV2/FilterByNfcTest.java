package com.moviles.filterV2;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;

class FilterByNfcTest {

	@Test
	void testFilterByNfc() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		FilterByNfc filterByNfc = new FilterByNfc(true);
		List<Movil> listaMovilesFiltrada = listaMoviles.stream().filter(movil->filterByNfc.filter(movil)).toList();
		assertEquals(listaMovilesFiltrada.size(), 8);
	}

}
