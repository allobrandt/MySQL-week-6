package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SheltersDAO {

	private Connection connection;
	private final String GET_SHELTERS_QUERY = "SELECT * FROM shelters";
	
	public SheltersDAO() {
		connection = DBConnection.getConnection();
	}
	
	// @villarr - method for reading the shelter table data.
		public void getShelters() throws SQLException {
			ResultSet rs = connection.prepareStatement(GET_SHELTERS_QUERY).executeQuery();
			while (rs.next()) {
			System.out.println("Location id = " + rs.getInt(1) + ", Clinic Onsite (Y/N) = " + rs.getString(2)
			 + ", Number of Cats = " + rs.getInt(3) + ", Number of Dogs = " + rs.getInt(4) + "\n");
		}

		}
	}