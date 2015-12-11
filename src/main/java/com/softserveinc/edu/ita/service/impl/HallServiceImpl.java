package com.softserveinc.edu.ita.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserveinc.edu.ita.dao.HallDao;
import com.softserveinc.edu.ita.entity.Hall;
import com.softserveinc.edu.ita.service.HallService;

@Service
public class HallServiceImpl implements HallService {

	@Autowired
	private HallDao dao;

	@Transactional
	@Override
	public void saveHall(Hall hall) {
		dao.save(hall);
	}

	@Transactional
	@Override
	public List<Hall> getAllHalls() {
		return dao.getAll();
	}

	@Transactional
	@Override
	public void updateHall(Hall hall) {
		dao.update(hall);
	}

	@Transactional
	@Override
	public void deleteHall(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	@Override
	public Hall findOneById(Long id) {
		return dao.findOneById(id);
	}

}
