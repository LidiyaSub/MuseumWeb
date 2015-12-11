package com.softserveinc.edu.ita.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserveinc.edu.ita.dao.WorkerDao;
import com.softserveinc.edu.ita.entity.Worker;
import com.softserveinc.edu.ita.service.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService {

	@Autowired
	private WorkerDao dao;

	@Transactional
	@Override
	public void saveWorker(Worker worker) {
		dao.save(worker);
	}

	@Transactional
	@Override
	public List<Worker> getAllWorkers() {
		return dao.getAll();
	}

	@Transactional
	@Override
	public void updateWorker(Worker worker) {
		dao.update(worker);
	}

	@Transactional
	@Override
	public void deleteWorker(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	@Override
	public Worker findOneById(Long id) {
		return dao.findOneById(id);
	}

}
