package com.moviles.filter;

public abstract class DecoratorFilter<ToFilter, Parameter>{
	
	protected Parameter parameter;
	
	public DecoratorFilter(Parameter parameter) {
		this.parameter=parameter;
	}
	
	public abstract ToFilter filter(ToFilter toFilter);
	public abstract ToFilter recursiveFilter(ToFilter toFilter);
}
