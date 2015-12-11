package com.softserveinc.edu.ita.service;

import java.util.List;

import com.softserveinc.edu.ita.entity.Schedule;

public interface ScheduleService {
	
	public void saveSchedule(Schedule schedule);

	public List<Schedule> getAllSchedules();

	public void updateSchedule(Schedule schedule);

	public void deleteSchedule(Long id);

	public Schedule findOneById(Long id);

}
