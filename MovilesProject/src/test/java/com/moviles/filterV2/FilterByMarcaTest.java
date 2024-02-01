package com.moviles.filterV2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;

class FilterByMarcaTest {
	@Test
	void testFilterByMarca() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		FilterByMarca filterByMarca = new FilterByMarca("Xiaomi");
		List<Movil> listaMovilesFiltrada = listaMoviles.stream().filter(movil->filterByMarca.filter(movil)).toList();
		assertEquals(listaMovilesFiltrada.size(), 1);
	}

}
