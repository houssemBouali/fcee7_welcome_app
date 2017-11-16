package com.app_jour_j.mvc.services;

import java.util.List;

import com.app_jour_j.mvc.entities.Industriel;

public interface IIndustrielService {

	public Industriel save(Industriel entity);

	public Industriel update(Industriel entity);

	public List<Industriel> selectAll();

	public Industriel getById(Long id);

	public void remove(Long id);

	public Industriel findOne(String paramName, Object paramValue);
}
