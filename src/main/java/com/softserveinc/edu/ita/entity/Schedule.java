package com.softserveinc.edu.ita.entity;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private Date day;

	@Column
	private Time time;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Schedule_Worker", joinColumns = @JoinColumn(name = "Id_Schedule"), inverseJoinColumns = @JoinColumn(name = "Id_Worker"))
	private List<Worker> worker;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Excursion_Schedule", joinColumns = @JoinColumn(name = "Id_Schedule"), inverseJoinColumns = @JoinColumn(name = "Id_Excursion"))
	private List<Excursion> listOfExcursion;

	public Schedule() {

	}

	public Schedule(Date day, Time time) {
		this.day = day;
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public List<Worker> getWorker() {
		return worker;
	}

	public void setWorker(List<Worker> worker) {
		this.worker = worker;
	}

	public List<Excursion> getListOfExcursion() {
		return listOfExcursion;
	}

	public void setListOfExcursion(List<Excursion> listOfExcursion) {
		this.listOfExcursion = listOfExcursion;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", day=" + day + ", time=" + time + ", worker=" + worker + ", listOfExcursion="
				+ listOfExcursion + "]";
	}

	}
