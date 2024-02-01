package com.moviles.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.filterV2.Filter;
import com.moviles.mapper.MapDTOFilterToListFilter;
import com.moviles.mapper.MapperMovilDTO;
import com.moviles.model.DTO.DTOMovil;
import com.moviles.model.DTO.DTOMovilFilter;
import com.moviles.model.DTO.DTORequestPuntuacion;
import com.moviles.model.DTO.DTOcompare;
import com.moviles.model.entity.Movil;
import com.moviles.model.entity.MovilKey;
import com.moviles.repositories.ModeloRepository;
import com.moviles.repositories.MovilRepository;
import com.moviles.service.FilterService;
import com.moviles.service.MovilService;

import io.micrometer.common.lang.NonNull;

@Service
public class MovilServiceImpl implements MovilService,FilterService<List<DTOMovil>, DTOMovilFilter> {

	private MovilRepository movilRepository;
	private ModeloRepository modeloRepository;
	
	public MovilServiceImpl(MovilRepository movilRepository) {
		this.movilRepository = movilRepository;
	}

	@Override
	public List<DTOMovil> getAll() {
		return this.movilRepository.findAll().stream()
				.map(movilTomap->new MapperMovilDTO().mapToDto(movilTomap))
				.toList();
	}

	@Override
	public Optional<DTOMovil> getById(@NonNull MovilKey key) {
		return this.movilRepository.findById(key).map(movil-> new MapperMovilDTO().mapToDto(movil));
	}

	@Override
	public boolean save(@NonNull DTOMovil dto) {
		return this.movilRepository.save(new MapperMovilDTO().mapToEntity(dto)) != null ? true : false;
	}

	@Override
	public boolean update(DTOMovil dto) {
		if(modeloRepository.findById(dto.getClaveModelo()).isPresent()){
			return this.movilRepository.findById(new MovilKey(modeloRepository.findById(dto.getClaveModelo()).get(), dto.getClaveMovil())).isPresent()
					? save(dto)
					: false;
		}
		return false;
	}

	@Override
	public boolean delete(@NonNull MovilKey key) {
		this.movilRepository.deleteById(key);
		return !this.movilRepository.findById(key).isPresent();
	}

	@Override
	public boolean updatePuntuacion(DTORequestPuntuacion requestPuntuacion) {
		DTOMovil movil = getById(requestPuntuacion.getKey()).get();
		movil.setPuntuacion(movil.getPuntuacion() + requestPuntuacion.getPuntuacion());
		return save(movil);
	}

	@Override
	public List<DTOMovil> findTopMovil() {
		return this.movilRepository.findTop5ByOrderByPuntuacionDesc().stream()
				.map(movil->new MapperMovilDTO().mapToDto(movil)).toList();
	}

	@Override
	public List<DTOMovil> filterByMarca(String marca) {
	 return this.movilRepository.findAll().stream().filter(movil -> {
			return movil.getMarcaId().equals(marca);
		}).map(movilToMap->new MapperMovilDTO().mapToDto(movilToMap)).toList();
	 
	}

	@Override
	public List<DTOMovil> compareMovile(DTOcompare keys) {
		List<DTOMovil> list = new ArrayList<>();
		list.add(new MapperMovilDTO().mapToDto(this.movilRepository.findById(keys.getKey1()).get()));
		list.add(new MapperMovilDTO().mapToDto(this.movilRepository.findById(keys.getKey2()).get()));
		return list;
	}

	@Override
	public List<DTOMovil> filter(DTOMovilFilter parametros) {
		List<Movil> toFilter = getAllMoviles();
		List<Filter<?>> filtros= new MapDTOFilterToListFilter().map(parametros);
		for (Filter<?> filter : filtros) {
			toFilter=toFilter.stream().filter(movil->filter.filter(movil)).toList();
		}
		return toFilter.stream().map(movil-> new MapperMovilDTO().mapToDto(movil)).toList();	
		
	}
	
	public List<Movil> getAllMoviles(){
		return movilRepository.findAll();
	}

}
