package com.softserveinc.edu.ita.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserveinc.edu.ita.dao.AuthorDao;
import com.softserveinc.edu.ita.entity.Author;
import com.softserveinc.edu.ita.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorDao dao;

	@Transactional
	@Override
	public void saveAuthor(Author author) {
		dao.save(author);
	}

	@Transactional
	@Override
	public List<Author> getAllAuthors() {
		return dao.getAll();
	}

	@Transactional
	@Override
	public void updateAuthor(Author author) {
		dao.update(author);
	}

	@Transactional
	@Override
	public void deleteAuthor(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	@Override
	public Author findOneById(Long id) {
		return dao.findOneById(id);
	}

}
