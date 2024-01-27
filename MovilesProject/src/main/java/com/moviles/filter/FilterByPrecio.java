package com.moviles.filter;

import java.util.List;
import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

public class FilterByPrecio extends BaseDecoratorFilter<List<Movil>,Intervalo> {
	
	public FilterByPrecio(DecoratorFilter<List<Movil>, ?> wrappedDecorator, Intervalo parameter) {
		super(parameter,wrappedDecorator);
	}

	@Override
	public List<Movil> filter(List<Movil> toFilter) {
		List<Movil> filtered = toFilter.stream()
				.filter(item->item.getPrecio()>parameter.getMin()&&item.getPrecio()<parameter.getMax())
				.toList();
		return wrappedDecorator.filter(filtered);
	}



}
