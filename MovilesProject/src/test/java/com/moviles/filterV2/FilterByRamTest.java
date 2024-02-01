package com.moviles.filterV2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

class FilterByRamTest {

	@Test
	void testFilterByRam() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		FilterByRam filterByRam = new FilterByRam(new Intervalo<Integer>(6,9));
		List<Movil> listaMovilesFiltrada = listaMoviles.stream().filter(movil->filterByRam.filter(movil)).toList();
		assertEquals(listaMovilesFiltrada.size(), 3);
	}

}
