package com.softserveinc.edu.ita.service;

import java.util.List;

import com.softserveinc.edu.ita.entity.Author;

public interface AuthorService {

	public void saveAuthor(Author author);

	public List<Author> getAllAuthors();

	public void updateAuthor(Author author);

	public void deleteAuthor(Long id);

	public Author findOneById(Long id);

}
