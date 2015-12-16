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
import javax.persistence.OneToMany;

@Entity
public class Worker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nameWorker;

	@Column
	private Integer salary;

	@Column
	private String position;

	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name = "Schedule_Worker", joinColumns = @JoinColumn(name = "Id_Worker"), inverseJoinColumns = @JoinColumn(name = "Id_Schedule"))
	private List<Schedule> listOfSchedule;

	@OneToMany(mappedBy = "worker", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY, orphanRemoval = false)
	private List<Hall> hall;

	public Worker() {

	}

	public Worker(String nameWorker, Integer salary, String position) {
		this.nameWorker = nameWorker;
		this.salary = salary;
		this.position = position;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameWorker() {
		return nameWorker;
	}

	public void setNameWorker(String nameWorker) {
		this.nameWorker = nameWorker;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<Schedule> getListOfSchedule() {
		return listOfSchedule;
	}

	public void setListOfSchedule(List<Schedule> listOfSchedule) {
		this.listOfSchedule = listOfSchedule;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", nameWorker=" + nameWorker + ", salary=" + salary + ", position=" + position
				+ "]";
	}

}
