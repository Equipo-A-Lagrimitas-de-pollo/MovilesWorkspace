package com.moviles.filterV2;

import com.moviles.model.entity.Movil;
public class FilterByMarca extends Filter<String>{

	public FilterByMarca(String parameter) {
		super(parameter);
	}

	@Override
	public boolean filter(Movil item) {
		return item.getMarcaId().equals(parameter);
	}

}
