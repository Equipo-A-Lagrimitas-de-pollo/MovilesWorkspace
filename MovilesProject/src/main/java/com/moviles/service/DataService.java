package com.moviles.service;

import java.util.List;
import java.util.Optional;

import com.moviles.model.DTO.DTOProcesador;

public interface DataService<T, ID> {

    public Optional<T> getById(ID id);

    public List<T> getAll();

    public boolean save(T entity);

    public boolean update(T entity);

    public boolean delete(ID id);

}
