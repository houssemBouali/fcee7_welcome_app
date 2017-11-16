package com.app_jour_j.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.app_jour_j.mvc.dao.IMediaDao;
import com.app_jour_j.mvc.entities.Media;
import com.app_jour_j.mvc.services.IMediaService;

@Transactional
public class MediaServiceImpl implements IMediaService {

	private IMediaDao dao;
	
	public void setDao(IMediaDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Media save(Media entity) {
		return dao.save(entity);
	}

	@Override
	public Media update(Media entity) {
		return dao.update(entity);
	}

	@Override
	public List<Media> selectAll() {
		return dao.selectAll();
	}

	@Override
	public Media getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Media findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

}
