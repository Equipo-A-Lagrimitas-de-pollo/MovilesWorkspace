package com.moviles.filterV2;


import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

public class FilterByPrecio extends Filter<Intervalo<Double>> {

	public FilterByPrecio(Intervalo<Double> parameter) {
		super(parameter);
	}

	@Override
	public boolean filter(Movil item) {
		return item.getPrecio()>=parameter.getMin()&&item.getPrecio()<=parameter.getMax();
	}

}
