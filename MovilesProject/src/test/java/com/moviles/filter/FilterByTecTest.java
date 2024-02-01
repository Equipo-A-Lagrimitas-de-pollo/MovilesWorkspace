package com.moviles.filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.MovilOM;
import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

@SpringBootTest
class FilterByTecTest {

	@Test
	void testFilterListOfMovil() {
		List<Movil> listaMoviles = MovilOM.createMovil();
		//Comprobando con una id que existe
		listaMoviles = new FilterByTec(1L, null).filter(listaMoviles);
		assertEquals(listaMoviles.size(), 1);
		//Comprobando con una id que no existe
		listaMoviles = new FilterByTec(15L, null).filter(listaMoviles);
		assertEquals(listaMoviles.size(), 0);
	}

}
