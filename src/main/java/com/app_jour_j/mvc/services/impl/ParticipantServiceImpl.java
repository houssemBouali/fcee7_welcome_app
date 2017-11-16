package com.app_jour_j.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.app_jour_j.mvc.dao.IParticipantDao;
import com.app_jour_j.mvc.entities.Participant;
import com.app_jour_j.mvc.services.IParticipantService;

@Transactional
public class ParticipantServiceImpl implements IParticipantService {

	private IParticipantDao dao;

	public void setDao(IParticipantDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Participant save(Participant entity) {
		return dao.save(entity);
	}

	@Override
	public Participant update(Participant entity) {
		return dao.update(entity);
	}

	@Override
	public List<Participant> selectAll() {
		return dao.selectAll();
	}

	@Override
	public Participant getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Participant findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

}
