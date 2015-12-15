package com.softserveinc.edu.ita.dto;

import com.softserveinc.edu.ita.entity.Schedule;
import com.softserveinc.edu.ita.entity.Worker;

public class WorkerScheduleDTO {

	private Worker worker;
	private Schedule[] schedule;

	public WorkerScheduleDTO() {

	}

	public WorkerScheduleDTO(Worker worker, Schedule[] schedule) {
		this.worker = worker;
		this.schedule = schedule;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Schedule[] getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule[] schedule) {
		this.schedule = schedule;
	}

}
