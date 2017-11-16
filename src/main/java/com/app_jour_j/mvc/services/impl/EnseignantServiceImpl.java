package com.app_jour_j.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.app_jour_j.mvc.dao.IEnseignantDao;
import com.app_jour_j.mvc.entities.Enseignant;
import com.app_jour_j.mvc.services.IEnseignantService;

@Transactional
public class EnseignantServiceImpl implements IEnseignantService {

	private IEnseignantDao dao;

	public void setDao(IEnseignantDao dao) {
		this.dao = dao;
	}

	@Override
	public Enseignant save(Enseignant entity) {
		return dao.save(entity);
	}

	@Override
	public Enseignant update(Enseignant entity) {
		return dao.update(entity);
	}

	@Override
	public List<Enseignant> selectAll() {
		return dao.selectAll();
	}

	@Override
	public Enseignant getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Enseignant findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

}
