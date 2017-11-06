package com.app_jour_j.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.app_jour_j.mvc.dao.IIndustrielDao;
import com.app_jour_j.mvc.entities.Industriel;
import com.app_jour_j.mvc.services.IIndustrielService;

@Transactional
public class IndustrielServiceImpl implements IIndustrielService {

	private IIndustrielDao dao;
	
	public void setDao(IIndustrielDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Industriel save(Industriel entity) {
		return dao.save(entity);
	}

	@Override
	public Industriel update(Industriel entity) {
		return dao.update(entity);
	}

	@Override
	public List<Industriel> selectAll() {
		return dao.selectAll();
	}

	@Override
	public Industriel getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Industriel findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

}
