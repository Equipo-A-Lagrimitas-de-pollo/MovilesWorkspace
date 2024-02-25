package com.moviles.populate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moviles.model.entity.MarcaProcesador;
import com.moviles.model.entity.Procesador;
import com.moviles.service.impl.MarcaProcesadorServiceImpl;

@Component
public class MarcaProcesadorPopulate {

	private MarcaProcesadorServiceImpl impl;

	public MarcaProcesadorPopulate(MarcaProcesadorServiceImpl impl) {
		super();
		this.impl = impl;
		populate();
	}

	private void populate() {
		ArrayList<MarcaProcesador> marcaProcesadors = new ArrayList<>();
		marcaProcesadors.add(new MarcaProcesador("Pepito", List.of(new Procesador(1L, null,0,0))));
		marcaProcesadors.add(new MarcaProcesador("Pepito",null));
		marcaProcesadors.add(new MarcaProcesador("Carlosos",  List.of(new Procesador(1L, null,0,0))));
		marcaProcesadors.forEach(marca->{
			System.out.println("guardando");
			impl.save(marca);
		});
	}
	
	
}
