package com.moviles.filter;

import java.util.List;

import com.moviles.model.entity.Movil;

public class FilterByTec extends BaseDecoratorFilter<List<Movil>, Long> {

	public FilterByTec(Long parameter, DecoratorFilter<List<Movil>, ?> wrappedDecorator) {
		super(parameter, wrappedDecorator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Movil> filter(List<Movil> toFilter) {
		return toFilter.stream()
				.filter(item->item.getTecId()==parameter)
				.toList();
	}

}
