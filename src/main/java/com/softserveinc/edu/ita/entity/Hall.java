package com.softserveinc.edu.ita.entity;

public class Hall {

	private int id;
	private String nameHall;
	private Worker worker;

	public Hall() {

	}

	public Hall(int id, String nameHall) {

		this.id = id;
		this.nameHall = nameHall;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameHall() {
		return nameHall;
	}

	public void setNameHall(String nameHall) {
		this.nameHall = nameHall;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	@Override
	public String toString() {
		return "Hall [id=" + id + ", nameHall=" + nameHall + ", worker="
				+ worker + "]";
	}

}
