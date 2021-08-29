package week_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) {
	String connectionString = "jdbc:mysql://localhost:3306/animals_shelter";
	//localhost is an alias to 127.0.0.1
	//3306 is the default port for MySQL
	
	try {
		Connection conn = DriverManager.getConnection(connectionString, "root", "groot");
		System.out.println("Connected Successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Error connecting to the database");
		e.printStackTrace();
	}

	}

}
