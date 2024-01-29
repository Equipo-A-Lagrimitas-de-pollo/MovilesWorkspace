package com.moviles.service;

import java.util.List;
import java.util.Optional;

public interface DataService<T, ID> {
	
    public Optional<T> getById(ID id);

    public List<T> getAll();

    public void save(T entity);

    public void update(T entity);

    public void delete(ID id);
    
}
