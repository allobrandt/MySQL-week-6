package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FosteringDAO {
	
	private Connection connection;
	private final String GET_FOSTER_QUERY = "SELECT * FROM fostering";

	public FosteringDAO() {
		connection = DBConnection.getConnection();	
	}
	// @villarr - method for reading the fostering table data.
	public void getFostering() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_FOSTER_QUERY).executeQuery();
		while (rs.next()) {
		System.out.println("Fostering id = " + rs.getInt(1) + ", Pet ID = " + rs.getInt(2)
		 + ", Volunteer ID = " + rs.getInt(3) + ", Foster Date = " + rs.getDate(4) + "\n");
	}

	}
	public void deleteFostering() {
		// TODO Auto-generated method stub
		
	}
}
