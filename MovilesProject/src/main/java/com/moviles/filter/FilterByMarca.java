package com.moviles.filter;

import java.util.List;

import com.moviles.model.entity.Movil;

public class FilterByMarca extends DecoratorFilter<List<Movil>, Integer>{

	public FilterByMarca(Integer parameter) {
		super(parameter);
	}

	@Override
	public List<Movil> filter(List<Movil> toFilter) {
		//TODO retornar la lista final filtrada
		return null;
	}

}
