package com.softserveinc.edu.ita.entity;

import java.util.List;

public class Author {

	private int id;
	private String nameAuthor;
	private List<Showpiece> listOfShowpiece;

	public Author() {

	}

	public Author(int id, String nameAuthor) {

		this.id = id;
		this.nameAuthor = nameAuthor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public List<Showpiece> getListOfShowpiece() {
		return listOfShowpiece;
	}

	public void setListOfShowpiece(List<Showpiece> listOfShowpiece) {
		this.listOfShowpiece = listOfShowpiece;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", nameAuthor=" + nameAuthor
				+ ", listOfShowpiece=" + listOfShowpiece + "]";
	}

}
