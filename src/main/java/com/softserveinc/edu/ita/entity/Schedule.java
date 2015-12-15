package com.softserveinc.edu.ita.entity;

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
	private String dateTime;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Schedule_Worker", joinColumns = @JoinColumn(name = "Id_Schedule"), inverseJoinColumns = @JoinColumn(name = "Id_Worker"))
	private List<Worker> worker;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Excursion_Schedule", joinColumns = @JoinColumn(name = "Id_Schedule"), inverseJoinColumns = @JoinColumn(name = "Id_Excursion"))
	private List<Excursion> listOfExcursion;

	public Schedule() {

	}

	public Schedule(String dateTime) {
		this.dateTime = dateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
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


	}
