package com.moviles.filterV2;

import com.moviles.model.entity.Movil;

public abstract class Filter<T> {
	protected T parameter;

	public Filter(T parameter) {
		this.parameter = parameter;
	}
	
	public abstract boolean filter(Movil item);
	
}
