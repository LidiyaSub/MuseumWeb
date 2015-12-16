package com.softserveinc.edu.ita.entity;

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
public class Excursion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nameExcursion;

	@Column
	private Time duration;

	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinTable(name = "Excursion_Schedule", joinColumns = @JoinColumn(name = "Id_Excursion"), inverseJoinColumns = @JoinColumn(name = "Id_Schedule"))
	private List<Schedule> listOfSchedule;

	public Excursion() {

	}

	public Excursion(String nameExcursion, Time duration) {
		this.nameExcursion = nameExcursion;
		this.duration = duration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameExcursion() {
		return nameExcursion;
	}

	public void setNameExcursion(String nameExcursion) {
		this.nameExcursion = nameExcursion;
	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public List<Schedule> getListOfSchedule() {
		return listOfSchedule;
	}

	public void setListOfSchedule(List<Schedule> listOfSchedule) {
		this.listOfSchedule = listOfSchedule;
	}

	@Override
	public String toString() {
		return "Excursion [id=" + id + ", nameExcursion=" + nameExcursion + ", duration=" + duration + "]";
	}

}
