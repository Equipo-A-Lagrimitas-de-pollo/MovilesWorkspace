package com.moviles.filterV2;

import com.moviles.model.entity.Marca;
import com.moviles.model.entity.Movil;
public class FilterByMarca extends Filter<Long>{

	public FilterByMarca(Long parameter) {
		super(parameter);
	}

	@Override
	public boolean filter(Movil item) {
		return item.getMarcaId()==parameter;
	}

}
