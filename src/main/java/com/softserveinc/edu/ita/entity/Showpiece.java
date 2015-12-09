package com.softserveinc.edu.ita.entity;

import java.util.Date;

public class Showpiece {
	private int id;
	private String nameShowpiece;
	private Date dateIncome;
	private String materials;
	private String technics;
	private Hall hall;
	private Author author;

	public Showpiece() {

	}

	public Showpiece(int id, String nameShowpiece, Date dateIncome,
			String materials, String technics) {

		this.id = id;
		this.nameShowpiece = nameShowpiece;
		this.dateIncome = dateIncome;
		this.materials = materials;
		this.technics = technics;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return "Showpiece [id=" + id + ", nameShowpiece=" + nameShowpiece
				+ ", dateIncome=" + dateIncome + ", materials=" + materials
				+ ", technics=" + technics + ", hall=" + hall + ", author="
				+ author + "]";
	}

}
