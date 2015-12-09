package com.softserveinc.edu.ita.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.softserveinc.edu.ita.entity.Author;
import com.softserveinc.edu.ita.entity.Excursion;
import com.softserveinc.edu.ita.entity.Hall;
import com.softserveinc.edu.ita.entity.Schedule;
import com.softserveinc.edu.ita.entity.Showpiece;
import com.softserveinc.edu.ita.entity.Worker;
import com.softserveinc.edu.ita.init.InitSessionFactory;

public class Main {

	public static void main(String[] args) {

		// --------JDBC------------- //
		// ConnectionToDB.connectToDB();
		//
		// CreateDropTables.dropTablesIfExists();
		// CreateDropTables.createTables();
		// FillTableWithData.fillTableWithData();
		//
		// Queries.firstInfoAboutShowpiece();
		// System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		// Queries.secondInfoAboutShowpieceByAuthor();
		// System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		// Queries.thirdInfoAboutShowpieceByWorkerName("Mick");
		// System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		// Queries.fourthInfoAboutShowpieceByHall();
		// System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		// Queries.fifthFindAllGuides();
		// System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		// Queries.eighthShowpiecesStatistics();

		Session session = InitSessionFactory.getSessionFactory().openSession();
		session.beginTransaction();

		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}
}
