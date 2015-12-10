package com.softserveinc.edu.ita.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserveinc.edu.ita.dao.AuthorDao;
import com.softserveinc.edu.ita.entity.Author;

@Repository
public class AuthorDaoImpl extends GeneralDaoImpl<Author, Long> implements AuthorDao {

}
