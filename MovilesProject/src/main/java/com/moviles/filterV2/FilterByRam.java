package com.moviles.filterV2;

import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

public class FilterByRam extends Filter<Intervalo<Integer>>{

	public FilterByRam(Intervalo<Integer> parameter) {
		super(parameter);
	}

	@Override
	public boolean filter(Movil item) {
		return item.getRam()>=parameter.getMin()&&item.getRam()<=parameter.getMax();
	}

}
