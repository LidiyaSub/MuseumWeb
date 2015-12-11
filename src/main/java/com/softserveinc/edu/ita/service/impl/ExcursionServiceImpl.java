package com.softserveinc.edu.ita.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserveinc.edu.ita.dao.ExcursionDao;
import com.softserveinc.edu.ita.entity.Excursion;
import com.softserveinc.edu.ita.service.ExcursionService;

@Service
public class ExcursionServiceImpl implements ExcursionService {

	@Autowired
	private ExcursionDao dao;

	@Transactional
	@Override
	public void saveExcursion(Excursion excursion) {
		dao.save(excursion);
	}

	@Transactional
	@Override
	public List<Excursion> getAllExcursions() {
		return dao.getAll();
	}

	@Transactional
	@Override
	public void updateExcursion(Excursion excursion) {
		dao.update(excursion);
	}

	@Transactional
	@Override
	public void deleteExcursion(Long id) {
		dao.delete(findOneById(id));

	}

	@Transactional
	@Override
	public Excursion findOneById(Long id) {
		return dao.findOneById(id);
	}

}