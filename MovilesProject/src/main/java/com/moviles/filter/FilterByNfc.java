package com.moviles.filter;

import java.util.List;

import com.moviles.model.entity.Movil;

public class FilterByNfc extends BaseDecoratorFilter<List<Movil>, Boolean> {

	public FilterByNfc(Boolean parameter, DecoratorFilter<List<Movil>, ?> wrappedDecorator) {
		super(parameter, wrappedDecorator);
	}

	@Override
	public List<Movil> filter(List<Movil> toFilter) {
		List<Movil>filtered = toFilter.stream()
				.filter((item) -> item.isNfc() == parameter)
				.toList();
		return wrappedDecorator.filter(filtered);
	}

}
