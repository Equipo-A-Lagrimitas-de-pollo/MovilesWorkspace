package com.moviles.service;

public interface FilterService<ToFilter,Parametros>{
	public ToFilter filter(Parametros parametros);
}
