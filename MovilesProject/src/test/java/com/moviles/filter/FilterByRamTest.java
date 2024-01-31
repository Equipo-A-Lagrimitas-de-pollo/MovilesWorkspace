package com.moviles.filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

@SpringBootTest
class FilterByRamTest {

	@Test
	void testFilterListOfMovil() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		Intervalo<Long> intervalo = new Intervalo<Long>(7L, 11L);
		listaMoviles = new FilterByRam(intervalo, null).filter(listaMoviles);
		assertEquals(listaMoviles.size(), 1);
	}

}
