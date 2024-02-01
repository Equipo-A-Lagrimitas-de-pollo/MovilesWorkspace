package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.mapper.MapperModeloDTO;
import com.moviles.model.DTO.DTOModelo;
import com.moviles.model.entity.Modelo;
import com.moviles.repositories.ModeloRepository;
import com.moviles.service.ModeloService;

@Service
public class ModeloServiceImpl implements ModeloService {

    private ModeloRepository modeloRepository;

    public ModeloServiceImpl(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    @Override
    public Optional<DTOModelo> getById(Long id) {
        return this.modeloRepository.findById(id).map(movil->new MapperModeloDTO().mapToDto(movil));
    }

    @Override
    public List<DTOModelo> getAll() {
        return this.modeloRepository.findAll().stream()
        		.map(movil-> new MapperModeloDTO().mapToDto(movil)).toList();
    }

    @Override
    public boolean save(DTOModelo dto) {
        return this.modeloRepository.save(new MapperModeloDTO().mapToEntity(dto)) != null;
    }

    @Override
    public boolean update(DTOModelo dto) {
    	Modelo modelo = new MapperModeloDTO().mapToEntity(dto);
        return this.modeloRepository.findById(modelo.getId()).isPresent() ? save(dto) : false;
    }

    @Override
    public boolean delete(Long id) {
        this.modeloRepository.deleteById(id);
        return !this.modeloRepository.findById(id).isPresent();
    }

}
