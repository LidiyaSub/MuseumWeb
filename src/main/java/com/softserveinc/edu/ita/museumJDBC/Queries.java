package com.softserveinc.edu.ita.museumJDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Queries {

	private static PreparedStatement ps;
	private static int counter = 0;
	private static ResultSet rs;

	public static void firstInfoAboutShowpiece() {
		try {
			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"SELECT s.NameShowpiece, s.DateIncome, s.Materials, s.Technics, h.NameHall, a.NameAuthor, w.NameWorker FROM showpiece s JOIN author a ON s.Id_author = a.Id JOIN hall h ON s.Id_hall = h.Id JOIN worker w ON w.Id = h.Id_Worker");

			rs = ps.executeQuery();
			System.out.println("Query #1 \nShows the name of showpiece, date when it comes, the material made of,"
					+ "\ntechnics used, name of hall, name of author and worker" + "\n");
			while (rs.next()) {
				counter++;
				System.out.println(counter + ". " + rs.getString("s.NameShowpiece") + ", "
						+ rs.getString("s.DateIncome") + ", " + rs.getString("s.Technics") + ", "
						+ rs.getString("h.NameHall") + ", " + rs.getString("a.NameAuthor") + ", "
						+ rs.getString("w.NameWorker"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void secondInfoAboutShowpieceByAuthor() {
		counter = 0;

		try {
			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"SELECT s.NameShowpiece, h.NameHall, a.NameAuthor FROM showpiece s JOIN author a ON s.Id_author = a.Id JOIN hall h ON s.Id_hall = h.Id");

			rs = ps.executeQuery();
			System.out.println("Query #2 \nShows the name of showpiece, name of hall, name of author" + "\n");
			while (rs.next()) {
				counter++;
				System.out.println(counter + ". " + rs.getString("s.NameShowpiece") + ", " + rs.getString("h.NameHall")
						+ ", " + rs.getString("a.NameAuthor"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void thirdInfoAboutShowpieceByWorkerName(String nameWorker) {
		counter = 0;

		try {
			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"SELECT s.NameShowpiece, w.NameWorker FROM showpiece s JOIN hall h ON h.Id = s.Id_hall JOIN Worker w ON w.Id = h.Id_worker WHERE w.NameWorker LIKE ?");
			ps.setString(1, nameWorker + "%");
			rs = ps.executeQuery();

			System.out.println("Query #3 \nShows the name of showpiece, name of worker" + "\n");
			while (rs.next()) {
				counter++;
				System.out.println(counter + ". " + rs.getString("s.NameShowpiece") + ", "
						+ rs.getString("w.NameWorker"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void fourthInfoAboutShowpieceByHall() {
		counter = 0;

		try {
			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"select s.NameShowpiece, h.NameHall from showpiece s join hall h on s.Id_hall = h.Id order by h.NameHall;");

			rs = ps.executeQuery();
			System.out.println("Query #4 \nShows the name of showpiece, name of hall" + "\n");
			while (rs.next()) {
				counter++;
				System.out
						.println(counter + ". " + rs.getString("s.NameShowpiece") + ", " + rs.getString("h.NameHall"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void fifthFindAllGuides() {
		counter = 0;
		try {
			ps = ConnectionToDB.getConnection().prepareStatement(
					"select NameWorker from worker where Position like 'Guide%';");
			rs = ps.executeQuery();
			System.out.println("Query #5 \nShow all guides");
			while (rs.next()) {
				counter++;
				System.out.println(counter + ". " + rs.getString("NameWorker"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void seventhFindExcursionsAvailableOnCertainDay(Date day) {
		counter = 0;
		try {
			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"select ex.NameExcursion from excursion ex join excursion_schedule es on ex.Id = es.Id_Excursion join schedule s on es.Id_Schedule = s.Id where s.Day = ?;");
			ps.setDate(1, (java.sql.Date) day);
			rs = ps.executeQuery();
			System.out.println("Query #7 \nShow all excursions available on " + day);
			while (rs.next()) {
				counter++;
				System.out.println(counter + ". " + rs.getString("ex.NameExcursion"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void eighthShowpiecesStatistics() {
		counter = 0;
		try {
			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"select s.NameShowpiece, a.NameAuthor, s.DateIncome, s.Materials, s.Technics, h.NameHall from showpiece s join hall h on s.Id_hall = h.Id join author a on s.Id_author = a.Id;");

			rs = ps.executeQuery();
			System.out.println("Query #8 \nShowspieces statistics");
			while (rs.next()) {
				counter++;
				System.out.println(counter + ". " + rs.getString("s.NameShowpiece") + ", "
						+ rs.getString("a.NameAuthor") + ", " + rs.getString("s.DateIncome") + ", "
						+ rs.getString("s.Materials") + ", " + rs.getString("s.Technics") + ", "
						+ rs.getString("h.NameHall"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void ninthExcursionsStatisticsByPeriod(Date fromDate, Date toDate) {
		counter = 0;
		try {
			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"select e.NameExcursion, count(e.id) as NumberOfExcursions from excursion e join excursion_schedule es on e.Id = es.Id_Excursion join schedule s on es.Id_Schedule = s.Id where s.Day >= ? and s.Day <= ? group by e.NameExcursion;");
			ps.setDate(1, (java.sql.Date) fromDate);
			ps.setDate(2, (java.sql.Date) toDate);
			rs = ps.executeQuery();
			System.out.println("Query #9 \nExcursions statistics by period from " + fromDate + " to " + toDate);
			while (rs.next()) {
				counter++;
				System.out.println(counter + ". " + rs.getString("e.NameExcursion") + ", "
						+ rs.getString("NumberOfExcursions"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void tenthGuidesStatisticsByPeriod(Date fromDate, Date toDate) {
		counter = 0;
		try {
			ps = ConnectionToDB
					.getConnection()
					.prepareStatement(
							"select w.NameWorker, count(e.id) as NumberOfExcursions, sum(e.Duration/10000) as hours from excursion e join excursion_schedule es on e.Id = es.Id_Excursion join schedule s on es.Id_Schedule = s.Id join schedule_worker sw on s.Id = sw.Id_Schedule join worker w on sw.Id_Worker = w.Id where s.Day >= ? and s.Day <= ? group by w.NameWorker;");
			ps.setDate(1, (java.sql.Date) fromDate);
			ps.setDate(2, (java.sql.Date) toDate);
			rs = ps.executeQuery();
			System.out.println("Query #10 \nGuides statistics by period from " + fromDate + " to " + toDate);
			while (rs.next()) {
				counter++;
				System.out.println(counter + ". " + rs.getString("w.NameWorker") + ", "
						+ rs.getInt("NumberOfExcursions") + ", " + rs.getString("hours"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

}
