package com.softserveinc.edu.ita.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.softserveinc.edu.ita.entity.Author;
import com.softserveinc.edu.ita.entity.Excursion;
import com.softserveinc.edu.ita.entity.Hall;
import com.softserveinc.edu.ita.entity.Schedule;
import com.softserveinc.edu.ita.entity.Showpiece;
import com.softserveinc.edu.ita.entity.Worker;

public class Asd {

	private static SessionFactory sessionFactory;

	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.addAnnotatedClass(Author.class).addAnnotatedClass(Excursion.class)
				.addAnnotatedClass(Hall.class).addAnnotatedClass(Schedule.class).addAnnotatedClass(Showpiece.class)
				.addAnnotatedClass(Worker.class).buildSessionFactory();
		return sessionFactory;
	}
	
}
