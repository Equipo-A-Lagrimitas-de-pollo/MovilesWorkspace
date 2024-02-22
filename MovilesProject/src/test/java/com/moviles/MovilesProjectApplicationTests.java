package com.moviles;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.OMs.MarcaOM;
import com.moviles.OMs.ModeloOM;
import com.moviles.OMs.ProcesadorOM;
import com.moviles.OMs.TecnologiaPantallaOM;
import com.moviles.model.entity.Marca;
import com.moviles.model.entity.Modelo;
import com.moviles.model.entity.Procesador;
import com.moviles.model.entity.TecnologiaPantalla;
import com.moviles.repositories.ProcesadorRepository;
import com.moviles.service.impl.MarcaServiceImpl;
import com.moviles.service.impl.ModeloServiceImpl;
import com.moviles.service.impl.ProcesadorDataServiceImpl;
import com.moviles.service.impl.TecnologiaPantallaservice;

@SpringBootTest
class MovilesProjectApplicationTests {
	
	@Autowired
	private MarcaServiceImpl marcaServiceImpl;
	@Autowired
	private ModeloServiceImpl modeloServiceImpl;
	 @Autowired
	 private TecnologiaPantallaservice repository;
	 @Autowired
	 private ProcesadorDataServiceImpl procesadorRepository;
	 private ModeloOM modeloOM =new ModeloOM();
	 private MarcaOM marcaOM=new MarcaOM();
	 private TecnologiaPantallaOM tecnologiaOM=new TecnologiaPantallaOM();
	 private ProcesadorOM om=new ProcesadorOM();
	

	@Test
	void contextLoads() {
		
	    List<Marca> marquitas = marcaOM.createMarca();
        List<Modelo> modelitos = modeloOM.createModelo();
        List<TecnologiaPantalla> tecnologiitas=tecnologiaOM.createTecnologiaPantalla();
        List<Procesador> procesador=om.createProcesador();
        for (int i = 0; i < marquitas.size(); i++) {
            Marca ma = marquitas.get(i);
            marcaServiceImpl.save(ma);
        }
        for (int i = 0; i < procesador.size(); i++) {
            Procesador pro = procesador.get(i);
            procesadorRepository.save(pro);
        }
        
        for (int i = 0; i < tecnologiitas.size(); i++) {
            TecnologiaPantalla tecnologia = tecnologiitas.get(i);
            repository.save(tecnologia);
        }

        for (int i = 0; i < modelitos.size(); i++) {
            Modelo mo = modelitos.get(i);
            modeloServiceImpl.save(mo);
        }
		
		
		
		
	}

}
