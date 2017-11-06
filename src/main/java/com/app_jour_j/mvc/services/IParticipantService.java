package com.app_jour_j.mvc.services;

import java.util.List;

import com.app_jour_j.mvc.entities.Participant;

public interface IParticipantService {

	public Participant save(Participant entity);

	public Participant update(Participant entity);

	public List<Participant> selectAll();

	public Participant getById(Long id);

	public void remove(Long id);

	public Participant findOne(String paramName, Object paramValue);

}
