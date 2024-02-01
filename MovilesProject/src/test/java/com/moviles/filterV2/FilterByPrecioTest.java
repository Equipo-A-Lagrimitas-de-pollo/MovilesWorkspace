package com.moviles.filterV2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

class FilterByPrecioTest {

	@Test
	void testFilterByPrecio() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		FilterByPrecio filterByPrecio = new FilterByPrecio(new Intervalo<Double>(899.98,1000.0));
		List<Movil> listaMovilesFiltrada = listaMoviles.stream().filter(movil->filterByPrecio.filter(movil)).toList();
		assertEquals(listaMovilesFiltrada.size(), 1);
	}

}
