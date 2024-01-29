package com.moviles.filter;

import java.util.List;

import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

public class FilterByRam extends BaseDecoratorFilter<List<Movil>, Intervalo> {

	public FilterByRam(Intervalo parameter, DecoratorFilter<List<Movil>, ?> wrappedDecorator) {
		super(parameter, wrappedDecorator);
	}

	@Override
	public List<Movil> filter(List<Movil> toFilter) {
		List<Movil> filtered =toFilter.stream()
				.filter(item->item.getRam()>parameter.getMin()&&item.getRam()<parameter.getMax())
				.toList();
		return wrappedDecorator.filter(filtered);
	}

}
