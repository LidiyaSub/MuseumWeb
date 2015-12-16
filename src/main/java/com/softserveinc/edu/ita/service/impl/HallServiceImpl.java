package com.softserveinc.edu.ita.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserveinc.edu.ita.dao.HallDao;
import com.softserveinc.edu.ita.dao.ShowpieceDao;
import com.softserveinc.edu.ita.dao.WorkerDao;
import com.softserveinc.edu.ita.entity.Hall;
import com.softserveinc.edu.ita.entity.Showpiece;
import com.softserveinc.edu.ita.entity.Worker;
import com.softserveinc.edu.ita.service.HallService;

@Service
public class HallServiceImpl implements HallService {

	@Autowired
	private HallDao dao;
	@Autowired
	private WorkerDao daoWorker;
	@Autowired
	private ShowpieceDao daoShowpiece;

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
	
	@Transactional
	@Override
	public List<Hall> getAllHallsWithWorkerAndShowpiece() {
		List<Hall> listHalls = dao.getAll();
		//List<Worker> listWorker = daoWorker.getAll();
		List<Showpiece> listShowpieces = daoShowpiece.getAll();
//		for (int i = 0; i < listHalls.size(); i++) {
//			for (int j = 0; j < listWorker.size(); j++) {
//				if(listHalls.get(i).getWorker().getId() == listWorker.get(j).getId()){
//					listHalls.get(i).getWorker().setNameWorker(listWorker.get(j).getNameWorker());
//				}
//			}
//		}
		for (int i = 0; i < listHalls.size(); i++) {
			for (int j = 0; j < listHalls.get(i).getShowpiece().size(); j++) {
				if(listHalls.get(i).getShowpiece().get(j).getId() == listShowpieces.get(j).getId()){
					listHalls.get(i).getShowpiece().get(j).setNameShowpiece(listShowpieces.get(j).getNameShowpiece());
				}
			}
		}
		return listHalls;
	}
}
