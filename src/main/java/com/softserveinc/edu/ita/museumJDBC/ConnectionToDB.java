package com.softserveinc.edu.ita.museumJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {

	private static final String URL = "jdbc:mysql://localhost:3306/museum";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private static Connection connection;

	public static void connectToDB() {
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void disconectFromDB() {
		try {
			if(connection != null) connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}
