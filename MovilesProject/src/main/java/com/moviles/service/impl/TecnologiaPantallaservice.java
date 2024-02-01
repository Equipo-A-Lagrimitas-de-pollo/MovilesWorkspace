package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.model.entity.TecnologiaPantalla;
import com.moviles.repositories.TecnologiaPantallaRepository;
import com.moviles.service.TecnologiaPantallaService;

@Service
public class TecnologiaPantallaservice implements TecnologiaPantallaService {

    private TecnologiaPantallaRepository tecnologiaPantallaRepository;

    public TecnologiaPantallaservice(TecnologiaPantallaRepository tegnologiaPantallaRepository) {
        this.tecnologiaPantallaRepository = tegnologiaPantallaRepository;
    }

    @Override
    public Optional<TecnologiaPantalla> getById(Long id) {
        return this.tecnologiaPantallaRepository.findById(id);
    }

    @Override
    public List<TecnologiaPantalla> getAll() {
        return this.tecnologiaPantallaRepository.findAll();
    }

    @Override
    public boolean save(TecnologiaPantalla entity) {
        return this.tecnologiaPantallaRepository.save(entity) != null;
    }

    @Override
    public boolean update(TecnologiaPantalla entity) {
        return this.tecnologiaPantallaRepository.findById(entity.getId()).isPresent() ? save(entity) : false;
    }

    @Override
    public boolean delete(Long id) {
        this.tecnologiaPantallaRepository.deleteById(id);
        return !this.tecnologiaPantallaRepository.findById(id).isPresent();
    }

}
