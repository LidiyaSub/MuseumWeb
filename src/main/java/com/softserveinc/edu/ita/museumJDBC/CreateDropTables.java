package com.softserveinc.edu.ita.museumJDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateDropTables {

	private static PreparedStatement ps;

	public static void dropTablesIfExists() {
		try {
			ps = ConnectionToDB.getConnection().prepareStatement("SET FOREIGN_KEY_CHECKS = 0");
			ps.execute();

			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"DROP TABLE IF EXISTS Schedule, Worker, Schedule_Worker, Excursion, Excursion_Schedule, Author, Hall, Showpiece ");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createTables() {

		try {

			ps = ConnectionToDB.getConnection().prepareStatement(
					"CREATE TABLE Schedule (Id int PRIMARY KEY AUTO_INCREMENT, Day Date, Time time)");
			ps.execute();

			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"CREATE TABLE Worker(Id int PRIMARY KEY AUTO_INCREMENT,NameWorker VARCHAR(255),Salary int,Position VARCHAR(255))");
			ps.execute();

			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"CREATE TABLE Schedule_Worker(Id_Worker int, Id_Schedule int, CONSTRAINT FK_Worker_Excursion_Worker FOREIGN KEY (Id_Worker) REFERENCES Worker(Id) ON DELETE SET NULL ON UPDATE SET NULL,CONSTRAINT FK_Excursion_Excursion_Worker FOREIGN KEY (Id_Schedule) REFERENCES Schedule(Id) ON DELETE SET NULL ON UPDATE SET NULL)");
			ps.execute();

			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"CREATE TABLE Excursion(Id int PRIMARY KEY AUTO_INCREMENT,NameExcursion VARCHAR(255),Duration time)");
			ps.execute();

			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"CREATE TABLE Excursion_Schedule(Id_Excursion int,Id_Schedule int,CONSTRAINT FK_Excursion_Schedule FOREIGN KEY (Id_Excursion) REFERENCES Excursion(Id) ON DELETE SET NULL ON UPDATE SET NULL,CONSTRAINT FK_Schedule_Excursion FOREIGN KEY (Id_Schedule) REFERENCES Schedule(Id) ON DELETE SET NULL ON UPDATE SET NULL)");
			ps.execute();

			ps = ConnectionToDB.getConnection().prepareStatement(
					"CREATE TABLE Author (Id INT PRIMARY KEY AUTO_INCREMENT,NameAuthor VARCHAR(255))");
			ps.execute();

			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"CREATE TABLE Hall (Id INT PRIMARY KEY AUTO_INCREMENT, NameHall VARCHAR(255), Id_worker int, CONSTRAINT FK_Hall_Worker FOREIGN KEY(Id_worker) REFERENCES Worker (Id) ON DELETE SET NULL ON UPDATE SET NULL)");
			ps.execute();

			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"CREATE TABLE Showpiece(Id int PRIMARY KEY AUTO_INCREMENT,NameShowpiece VARCHAR(255),DateIncome date,Materials VARCHAR(255),Technics VARCHAR(255),Id_hall int,Id_author int,CONSTRAINT FK_Showpiece_Hall FOREIGN KEY (Id_hall) REFERENCES Hall (Id) ON DELETE SET NULL ON UPDATE SET NULL,CONSTRAINT FK_Showpiece_Author FOREIGN KEY (Id_author) REFERENCES Author (Id) ON DELETE SET NULL ON UPDATE SET NULL)");
			ps.execute();

			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
