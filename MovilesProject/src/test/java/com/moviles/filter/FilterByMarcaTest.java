package com.moviles.filter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;

@SpringBootTest
class FilterByMarcaTest {

	@Test
	void testFilterListOfMovil() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		
		listaMoviles = new FilterByMarca(2L).filter(listaMoviles);
		assertEquals(listaMoviles.size(), 1);
	}

}
