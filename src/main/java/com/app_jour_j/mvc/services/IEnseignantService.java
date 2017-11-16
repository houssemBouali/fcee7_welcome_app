package com.app_jour_j.mvc.services;

import java.util.List;

import com.app_jour_j.mvc.entities.Enseignant;

public interface IEnseignantService {

	public Enseignant save(Enseignant entity);

	public Enseignant update(Enseignant entity);

	public List<Enseignant> selectAll();

	public Enseignant getById(Long id);

	public void remove(Long id);

	public Enseignant findOne(String paramName, Object paramValue);
}
