package application;

// @allobrandt - team project with @villarr

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws SQLException {
		Menu menu = new Menu();
		menu.start();

		String connectionString = "jdbc:mysql://localhost:3306/animals_shelter";
		//@allobrandt - localhost is an alias to 127.0.0.1
		//@allobrandt - 3306 is the default port for MySQL

		try {
			@SuppressWarnings("unused")
			Connection conn = DriverManager.getConnection(connectionString, "root", "groot");
			System.out.println("Connected Successfully");
		} catch (SQLException e) {
		
			System.out.println("Error connecting to the database");
			e.printStackTrace();
		}

	}

}