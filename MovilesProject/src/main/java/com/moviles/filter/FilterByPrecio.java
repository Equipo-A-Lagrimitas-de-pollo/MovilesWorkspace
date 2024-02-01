package com.moviles.filter;

import java.util.List;
import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

public class FilterByPrecio extends BaseDecoratorFilter<List<Movil>,Intervalo<Double>> {
	
	public FilterByPrecio(DecoratorFilter<List<Movil>, ?> wrappedDecorator, Intervalo<Double> parameter) {
		super(parameter,wrappedDecorator);
	}

	@Override
	public List<Movil> filter(List<Movil> toFilter) {
		return toFilter.stream()
				.filter(item->item.getPrecio()>parameter.getMin()&&item.getPrecio()<parameter.getMax())
				.toList();
	}



}
