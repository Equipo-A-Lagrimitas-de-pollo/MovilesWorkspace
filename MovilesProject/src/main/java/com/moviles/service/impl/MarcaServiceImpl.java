package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.mapper.MapperMarcaDTO;
import com.moviles.model.DTO.DTOMarca;
import com.moviles.model.entity.Marca;
import com.moviles.repositories.MarcaRepository;
import com.moviles.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService{

    private MarcaRepository marcaRepository;

    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public Optional<DTOMarca> getById(Long id) {
        return this.marcaRepository.findById(id).map(movil-> new MapperMarcaDTO().mapToDto(movil));
    }

    @Override
    public List<DTOMarca> getAll() {
        return this.marcaRepository.findAll().stream()
        		.map(movil->new MapperMarcaDTO().mapToDto(movil)).toList();
    }

    @Override
    public boolean save(DTOMarca dto) {
        return this.marcaRepository.save(new MapperMarcaDTO().mapToEntity(dto)) != null;

    }

    @Override
    public boolean update(DTOMarca dto) {
    	Marca entity = new MapperMarcaDTO().mapToEntity(dto);
        return this.marcaRepository.findById(entity.getId()).isPresent() ? save(dto) : false;
    }

    @Override
    public boolean delete(Long id) {
        marcaRepository.deleteById(id);
        return !this.marcaRepository.findById(id).isPresent();
    }

}
