package com.moviles.filter;

import java.util.List;

import com.moviles.model.entity.Movil;

public class FilterByMarca extends DecoratorFilter<List<Movil>, Long>{

	public FilterByMarca(Long parameter) {
		super(parameter);
	}

	@Override
	public List<Movil> filter(List<Movil> toFilter) {
		return toFilter.stream().filter(movil->movil.getMarcaId()==parameter).toList();
	}

}
