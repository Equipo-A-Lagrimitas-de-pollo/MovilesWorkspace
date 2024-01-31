package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

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
    public Optional<Modelo> getById(Long id) {
        return this.modeloRepository.findById(id);
    }

    @Override
    public List<Modelo> getAll() {
        return this.modeloRepository.findAll();
    }

    @Override
    public boolean save(Modelo entity) {
        return this.modeloRepository.save(entity) != null;
    }

    @Override
    public boolean update(Modelo entity) {
        return this.modeloRepository.findById(entity.getId()).isPresent() ? save(entity) : false;
    }

    @Override
    public boolean delete(Long id) {
        this.modeloRepository.deleteById(id);
        return !this.modeloRepository.findById(id).isPresent();
    }

}
