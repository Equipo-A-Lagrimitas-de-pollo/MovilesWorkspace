package com.moviles.filterV2;

import com.moviles.model.entity.Movil;

public class FilterByNfc extends Filter<Boolean>{

	public FilterByNfc(Boolean parameter) {
		super(parameter);
	}

	@Override
	public boolean filter(Movil item) {
		return item.isNfc()==parameter;
	}

}
