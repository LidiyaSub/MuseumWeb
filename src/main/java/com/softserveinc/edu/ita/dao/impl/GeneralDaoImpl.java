package com.softserveinc.edu.ita.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.softserveinc.edu.ita.dao.GeneralDao;

public abstract class GeneralDaoImpl<E, N extends Number> implements GeneralDao<E, N> {

	private Class<E> entityClass;

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public GeneralDaoImpl() {
		entityClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public Class<E> getEntityClass() {
		return entityClass;
	}

	public void closeSessionFactory() {
		if (sessionFactory != null)
			sessionFactory.close();
	}

	public void save(E entity) {
		sessionFactory.getCurrentSession().save(entity);
	}

	public void update(E entity) {
		sessionFactory.getCurrentSession().update(entity);
	}

	@SuppressWarnings("unchecked")
	public List<E> getAll() {
		List<E> entities = sessionFactory.getCurrentSession().createCriteria(entityClass).list();
		return entities;
	}

	public void delete(E entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public E findOneById(Number id) {
		E entity = (E) sessionFactory.getCurrentSession().get(entityClass, id);
		return entity;
	}

}
