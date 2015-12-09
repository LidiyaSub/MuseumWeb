package com.softserveinc.edu.ita.entity;

public class Worker {

	private int id;
	private String nameWorker;
	private int salary;
	private String position;

	public Worker() {

	}

	public Worker(int id, String nameWorker, int salary, String position) {
		this.id = id;
		this.nameWorker = nameWorker;
		this.salary = salary;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameWorker() {
		return nameWorker;
	}

	public void setNameWorker(String nameWorker) {
		this.nameWorker = nameWorker;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", nameWorker=" + nameWorker + ", salary=" + salary + ", position=" + position
				+ "]";
	}

}
