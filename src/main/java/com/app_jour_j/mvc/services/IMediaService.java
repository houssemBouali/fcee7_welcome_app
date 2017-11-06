package com.app_jour_j.mvc.services;

import java.util.List;

import com.app_jour_j.mvc.entities.Media;

public interface IMediaService {
	
	public Media save(Media entity);

	public Media update(Media entity);

	public List<Media> selectAll();

	public Media getById(Long id);

	public void remove(Long id);

	public Media findOne(String paramName, Object paramValue);
}
