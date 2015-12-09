package com.softserveinc.edu.ita.util;

import com.softserveinc.edu.ita.museumJDBC.ConnectionToDB;
import com.softserveinc.edu.ita.museumJDBC.CreateDropTables;
import com.softserveinc.edu.ita.museumJDBC.FillTableWithData;
import com.softserveinc.edu.ita.museumJDBC.Queries;

public class Main {

	public static void main(String[] args) {

		// --------JDBC------------- //
		ConnectionToDB.connectToDB();

		CreateDropTables.dropTablesIfExists();
		CreateDropTables.createTables();
		FillTableWithData.fillTableWithData();

		Queries.firstInfoAboutShowpiece();
		System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		Queries.secondInfoAboutShowpieceByAuthor();
		System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		Queries.thirdInfoAboutShowpieceByWorkerName("Mick");
		System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		Queries.fourthInfoAboutShowpieceByHall();
		System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		Queries.fifthFindAllGuides();
		System.out.println("---***---***---***----***---***---***----***---***---***----***---***---***----");
		Queries.eighthShowpiecesStatistics();
	}
}
