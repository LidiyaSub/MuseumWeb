package com.softserveinc.edu.ita.service;

import java.util.List;

import com.softserveinc.edu.ita.entity.Worker;

public interface WorkerService {

	public void saveWorker(Worker worker);

	public List<Worker> getAllWorkers();

	public void updateWorker(Worker worker);

	public void deleteWorker(Long id);

	public Worker findOneById(Long id);

}
