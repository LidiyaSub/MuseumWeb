package com.softserveinc.edu.ita.service;

import java.util.List;

import com.softserveinc.edu.ita.entity.Hall;

public interface HallService {
	
	public void saveHall(Hall hall);

	public List<Hall> getAllHalls();

	public void updateHall(Hall hall);

	public void deleteHall(Long id);

	public Hall findOneById(Long id);

	public List<Hall> getAllHallsWithWorkerAndShowpiece();

}
