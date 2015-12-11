package com.softserveinc.edu.ita.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserveinc.edu.ita.dao.ScheduleDao;
import com.softserveinc.edu.ita.entity.Schedule;
import com.softserveinc.edu.ita.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleDao dao;

	@Transactional
	@Override
	public void saveSchedule(Schedule schedule) {
		dao.save(schedule);
	}

	@Transactional
	@Override
	public List<Schedule> getAllSchedules() {
		return dao.getAll();
	}

	@Transactional
	@Override
	public void updateSchedule(Schedule schedule) {
		dao.update(schedule);
	}

	@Transactional
	@Override
	public void deleteSchedule(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	@Override
	public Schedule findOneById(Long id) {
		return dao.findOneById(id);
	}

}
