package com.moviles.mapper;
import java.util.List;

import com.moviles.filter.DecoratorFilter;
import com.moviles.model.DTO.DTOMovilFilter;
import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;
import com.moviles.filter.FilterByPrecio;
import com.moviles.filter.FilterByMarca;

public class MapDTOFilterToDecoratorFilter implements Mapper<DTOMovilFilter, DecoratorFilter> {

	@Override
	public DecoratorFilter map(DTOMovilFilter t) {
		DecoratorFilter<List<Movil>,Integer> concrete = new FilterByMarca(t.getIdMarca());
		Intervalo priceInterval = new Intervalo(t.getPrecioMin(), t.getPrecioMax());
		DecoratorFilter<List<Movil>, Intervalo> filter = new FilterByPrecio(concrete, new Intervalo());
		return filter;
	}




}
