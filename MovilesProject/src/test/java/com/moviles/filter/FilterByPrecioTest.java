package com.moviles.filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

@SpringBootTest
class FilterByPrecioTest {

	@Test
	void testFilterListOfMovil() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		Intervalo<Double> intervalo = new Intervalo<Double>(200.0, 1000.0);
		listaMoviles = new FilterByPrecio(null, intervalo).filter(listaMoviles);
		assertEquals(listaMoviles.size(), 2);
	}

}
