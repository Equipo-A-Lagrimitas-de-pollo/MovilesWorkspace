package com.moviles.filter;

public abstract class BaseDecoratorFilter<ToFilter, Parameter> extends DecoratorFilter<ToFilter, Parameter>{

	protected DecoratorFilter<ToFilter,?> wrappedDecorator;
	
	public BaseDecoratorFilter(Parameter parameter, DecoratorFilter<ToFilter,?> wrappedDecorator) {
		super(parameter);
		this.wrappedDecorator=wrappedDecorator;
	}
	@Override
	public ToFilter recursiveFilter(ToFilter toFilter) {
		return callNext(filter(toFilter));
	}
	
	private ToFilter callNext(ToFilter toFilter) {
		return wrappedDecorator.recursiveFilter(toFilter);
	}

}
