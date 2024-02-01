package com.moviles.mapper;

public interface Mapper<T,S> {

	public S map(T t);
}
