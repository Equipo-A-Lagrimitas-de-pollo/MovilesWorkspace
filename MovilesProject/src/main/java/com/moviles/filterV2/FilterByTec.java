package com.moviles.filterV2;

import com.moviles.model.entity.Movil;

public class FilterByTec extends Filter<Long>{

	public FilterByTec(Long parameter) {
		super(parameter);
	}

	@Override
	public boolean filter(Movil item) {
		return item.getTecId()==parameter;
	}

}
