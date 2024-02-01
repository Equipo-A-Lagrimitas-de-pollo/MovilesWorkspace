package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.mapper.MapperTecnologiaPantallaDTO;
import com.moviles.model.DTO.DTOTecnologiaPantalla;
import com.moviles.model.entity.TecnologiaPantalla;
import com.moviles.repositories.TecnologiaPantallaRepository;
import com.moviles.service.TecnologiaPantallaService;

@Service
public class TecnologiaPantallaserviceImpl implements TecnologiaPantallaService {

    private TecnologiaPantallaRepository tecnologiaPantallaRepository;

    public TecnologiaPantallaserviceImpl(TecnologiaPantallaRepository tegnologiaPantallaRepository) {
        this.tecnologiaPantallaRepository = tegnologiaPantallaRepository;
    }

    @Override
    public Optional<DTOTecnologiaPantalla> getById(Long id) {
        return this.tecnologiaPantallaRepository.findById(id).map(tec->new MapperTecnologiaPantallaDTO().mapToDto(tec));
    }

    @Override
    public List<DTOTecnologiaPantalla> getAll() {
        return this.tecnologiaPantallaRepository.findAll().stream()
        		.map(tec-> new MapperTecnologiaPantallaDTO().mapToDto(tec)).toList();
    }

    @Override
    public boolean save(DTOTecnologiaPantalla dto) {
        return this.tecnologiaPantallaRepository.save(new MapperTecnologiaPantallaDTO().mapToEntity(dto)) != null;
    }

    @Override
    public boolean update(DTOTecnologiaPantalla dto) {
    	TecnologiaPantalla tec = new MapperTecnologiaPantallaDTO().mapToEntity(dto);
        return this.tecnologiaPantallaRepository.findById(tec.getId()).isPresent()
        		? save(new MapperTecnologiaPantallaDTO().mapToDto(tec)) : false;
    }

    @Override
    public boolean delete(Long id) {
        this.tecnologiaPantallaRepository.deleteById(id);
        return !this.tecnologiaPantallaRepository.findById(id).isPresent();
    }

}
