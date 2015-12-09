package com.softserveinc.edu.ita.entity;

import java.sql.Date;
import java.sql.Time;

public class Schedule {

	private int id;
	private Date day;
	private Time time;

	public Schedule() {

	}

	public Schedule(int id, Date day, Time time) {
		this.id = id;
		this.day = day;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", day=" + day + ", time=" + time + "]";
	}

}
