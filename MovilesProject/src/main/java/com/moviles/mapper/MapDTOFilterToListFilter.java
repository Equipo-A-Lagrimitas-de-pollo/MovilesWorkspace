package com.moviles.mapper;

import com.moviles.filterV2.Filter;
import com.moviles.filterV2.FilterByPrecio;
import com.moviles.filterV2.FilterByRam;
import com.moviles.filterV2.FilterByTec;
import com.moviles.filterV2.FilterByMarca;
import com.moviles.filterV2.FilterByNfc;
import com.moviles.model.DTO.DTOMovilFilter;
import com.moviles.util.Intervalo;

import java.util.List;
import java.util.ArrayList;

public class MapDTOFilterToListFilter implements Mapper<DTOMovilFilter, List<Filter<?>>>{

	@Override
	public List<Filter<?>> map(DTOMovilFilter t) {
		List<Filter<?>> filtros = new ArrayList<>();
		FilterByMarca filterByMarca = new FilterByMarca(t.getNombreMarca());
		filtros.add(filterByMarca);
		FilterByPrecio filterByPrecio = new FilterByPrecio(new Intervalo<>(t.getPrecioMin(),t.getPrecioMax()));
		filtros.add(filterByPrecio);
		if (!(t.getRamMax() == 0 || t.getRamMax() == 0)) {
			FilterByRam filterByRam = new FilterByRam(new Intervalo<>(t.getRamMin(),t.getRamMax()));
			filtros.add(filterByRam);
		}
		if (t.getNfc() != null) {
			FilterByNfc filterByNfc = new FilterByNfc(t.getNfc());
			filtros.add(filterByNfc);
		}
		if (t.getIdTecnologiaPantalla() != null) {
			FilterByTec filterByTec = new FilterByTec(t.getIdTecnologiaPantalla());
			filtros.add(filterByTec);
		}
		return filtros;
	}
	
}
