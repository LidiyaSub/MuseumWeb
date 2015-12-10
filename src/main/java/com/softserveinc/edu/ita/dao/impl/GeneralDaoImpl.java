package com.softserveinc.edu.ita.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.softserveinc.edu.ita.dao.GeneralDao;
import com.softserveinc.edu.ita.init.InitSessionFactory;

public abstract class GeneralDaoImpl<E, N extends Number> implements GeneralDao<E, N> {

	private Class<E> entityClass;

	@SuppressWarnings("unchecked")
	public GeneralDaoImpl() {
		entityClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	private SessionFactory sessionFactory = InitSessionFactory.getSessionFactory();

	public void closeSessionFactory() {
		if (sessionFactory != null)
			sessionFactory.close();
	}

	public void save(E entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();

	}

	public void update(E entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();

	}

	@SuppressWarnings("unchecked")
	public List<E> getAll() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<E> entities = session.createCriteria(entityClass).list();
		session.getTransaction().commit();
		session.close();
		return entities;
	}

	public void delete(E entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		session.close();

	}

	@SuppressWarnings("unchecked")
	public E findOneById(Number id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		E entity = (E) session.get(entityClass, id);
		session.close();
		return entity;
	}

	public Class<E> getEntityClass() {
		return entityClass;
	}

}
