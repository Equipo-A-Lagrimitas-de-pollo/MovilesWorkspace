package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

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
    public Optional<Marca> getById(Long id) {
        return this.marcaRepository.findById(id);
    }

    @Override
    public List<Marca> getAll() {
        return this.marcaRepository.findAll();
    }

    @Override
    public boolean save(Marca entity) {
        return this.marcaRepository.save(entity) != null;

    }

    @Override
    public boolean update(Marca entity) {
        return this.marcaRepository.findById(entity.getId()).isPresent() ? save(entity) : false;
    }

    @Override
    public boolean delete(Long id) {
        marcaRepository.deleteById(id);
        return !this.marcaRepository.findById(id).isPresent();
    }

}
