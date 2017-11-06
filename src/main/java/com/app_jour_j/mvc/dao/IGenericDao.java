package com.app_jour_j.mvc.dao;

import java.util.List;

public interface IGenericDao<E> {

	public E save(E entity);

	public E update(E entity);

	public List<E> selectAll();

	public E getById(Long id);

	public void remove(Long id);

	public E findOne(String paramName, Object paramValue);

}
