package com.softserveinc.edu.ita.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Showpiece {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nameShowpiece;

	@Column
	private Date dateIncome;

	@Column
	private String materials;

	@Column
	private String technics;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Hall hall;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Author author;

	public Showpiece() {

	}

	public Showpiece(String nameShowpiece, Date dateIncome, String materials, String technics) {
		this.nameShowpiece = nameShowpiece;
		this.dateIncome = dateIncome;
		this.materials = materials;
		this.technics = technics;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameShowpiece() {
		return nameShowpiece;
	}

	public void setNameShowpiece(String nameShowpiece) {
		this.nameShowpiece = nameShowpiece;
	}

	public Date getDateIncome() {
		return dateIncome;
	}

	public void setDateIncome(Date dateIncome) {
		this.dateIncome = dateIncome;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getTechnics() {
		return technics;
	}

	public void setTechnics(String technics) {
		this.technics = technics;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Showpiece [id=" + id + ", nameShowpiece=" + nameShowpiece + ", dateIncome=" + dateIncome
				+ ", materials=" + materials + ", technics=" + technics + ", hall=" + hall + ", author=" + author + "]";
	}

}
