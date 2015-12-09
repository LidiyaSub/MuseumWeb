package com.softserveinc.edu.ita.util;

import com.softserveinc.edu.ita.dao.WorkerDao;
import com.softserveinc.edu.ita.dao.impl.WorkerDaoImpl;
import com.softserveinc.edu.ita.entity.Worker;

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

		Worker w = new Worker();
		WorkerDao workerDao = new WorkerDaoImpl();
		workerDao.save(w);

		System.exit(0);
	}
}
