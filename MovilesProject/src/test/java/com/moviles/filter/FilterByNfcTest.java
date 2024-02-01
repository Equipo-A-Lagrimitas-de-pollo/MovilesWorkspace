package com.moviles.filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;

@SpringBootTest
class FilterByNfcTest {

	@Test
	void testFilterListOfMovil() {
		List<Movil> listaMoviles = MovilOM.createMovil();

		listaMoviles = new FilterByNfc(true, null).filter(listaMoviles);
		assertEquals(listaMoviles.size(), 7);
	}

}
