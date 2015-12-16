package com.softserveinc.edu.ita.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nameAuthor;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Showpiece> listOfShowpiece;

	public Author() {

	}

	public Author(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return "Author [id=" + id + ", nameAuthor=" + nameAuthor + "]";
	}

}
