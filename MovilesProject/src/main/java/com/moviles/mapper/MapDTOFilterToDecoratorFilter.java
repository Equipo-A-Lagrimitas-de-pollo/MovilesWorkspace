package com.moviles.mapper;

import java.util.List;

import com.moviles.filter.DecoratorFilter;
import com.moviles.filter.FilterByMarca;
import com.moviles.filter.FilterByNfc;
import com.moviles.filter.FilterByPrecio;
import com.moviles.filter.FilterByRam;
import com.moviles.filter.FilterByTec;
import com.moviles.model.DTO.DTOMovilFilter;
import com.moviles.model.entity.Movil;
import com.moviles.util.Intervalo;

public class MapDTOFilterToDecoratorFilter implements Mapper<DTOMovilFilter, DecoratorFilter> {

	@Override
	public DecoratorFilter map(DTOMovilFilter t) {
		DecoratorFilter<List<Movil>, Long> concrete = new FilterByMarca(t.getIdMarca());
		Intervalo<Double> priceInterval = new Intervalo<Double>(t.getPrecioMin(), t.getPrecioMax());
		DecoratorFilter filter = new FilterByPrecio(concrete, priceInterval);
		if (!(t.getRamMax() == 0 || t.getRamMax() == 0)) {
			Intervalo<Long> ramInterval = new Intervalo<Long>(Long.valueOf(t.getRamMin()), Long.valueOf(t.getRamMax()));
			filter = new FilterByRam(ramInterval, filter);
		}
		if (t.getNfc() != null) {
			filter = new FilterByNfc(t.getNfc(), filter);
		}
		if (t.getIdTecnologiaPantalla() != null) {
			filter = new FilterByTec(t.getIdTecnologiaPantalla(), filter);
		}
		return filter;
	}
}
