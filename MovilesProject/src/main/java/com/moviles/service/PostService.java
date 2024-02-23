package com.moviles.service;

import java.util.List;

public interface PostService<T, Dto, Response> {

	public void createPostVenta(T t, Dto dto);
	public void createPostIntercambio(T t, Dto dto);
	public List<Dto> getUserPosts(T t);
	public List<Dto> findAll();
	public Response delete(T t, int id);
	public Response edit(Dto dto);
	public List<Dto> findPostIntercambio();
	public List<Dto> findPostVenta();
}
