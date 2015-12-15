package com.softserveinc.edu.ita.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hall {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nameHall;

	@OneToMany(mappedBy = "hall", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Showpiece> showpiece;

	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Worker worker;

	public Hall() {

	}

	public Hall(String nameHall) {
		this.nameHall = nameHall;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameHall() {
		return nameHall;
	}

	public void setNameHall(String nameHall) {
		this.nameHall = nameHall;
	}

	public List<Showpiece> getShowpiece() {
		return showpiece;
	}

	public void setShowpiece(List<Showpiece> showpiece) {
		this.showpiece = showpiece;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	@Override
	public String toString() {
		return "Hall [id=" + id + ", nameHall=" + nameHall + "]";
	}

}
