package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// @villarr - Volunteers Dao access object class containing methods and SQL statements used in the methods which are called in the application menu. 
//@allobrandt - reduced tables included only Volunteer ID, Location ID, First Name, Last Name, and Phone Number fields  

public class VolunteersDAO {
	private Connection connection;
	private final String GET_VOLUNTEERS_QUERY = "SELECT * FROM volunteers";
	private final String CREATE_VOLUNTEERS_QUERY = "INSERT INTO volunteers (volunteer_id, location_id, first_name, last_name, phone_number) VALUES(?,?,?,?,?))";
	private final String DELETE_VOLUNTEERS_QUERY = "DELETE from volunteers WHERE volunteer_id = ?";
	private final String UPDATE_VOLUNTEERS_QUERY = "UPDATE volunteers SET current_foster_pets = ? WHERE volunteer_id = ?";
	private Scanner sc = new Scanner(System.in);

	public VolunteersDAO() {
		connection = DBConnection.getConnection();
	}
	// @villarr - method for creating volunteers

	public void createVolunteers() throws SQLException {

		int n = 0;

		PreparedStatement ps = connection.prepareStatement(CREATE_VOLUNTEERS_QUERY);

		System.out.println("Enter no. of volunteers to insert");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			//@allobrandt - updated console menu prompts
			System.out.println("Please enter new Volunteer ID#");
			Integer volunteerId = sc.nextInt();

			System.out.println("Which shelter location will this volunteer be assigned?");
			Integer locationId = sc.nextInt();

			System.out.println("Enter volunteer's first name:");
			String fistName = sc.next();

			System.out.println("Enter volunteer's last name:");
			String lastName = sc.next();

			System.out.println("Enter volunteer's 10-digit phone number:");
			String phone = sc.next();


			ps.setInt(1, volunteerId);
			ps.setInt(2, locationId);
			ps.setString(3, fistName);
			ps.setString(4, lastName);
			ps.setString(5, phone);
		}
		int rows = ps.executeUpdate();

		if (rows > 0) {
			System.out.println("New information has been added to the volunteers table. Thank you." + "\n");
		} else
			System.out.println("No records were updated.");
	}

	// @villarr - method for deleting volunteers based on a volunteer id which is
	// displayed when the method is called.

	public void deleteVolunteers() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_VOLUNTEERS_QUERY).executeQuery();
		while (rs.next()) {
			System.out.println("volunteer id = " + rs.getInt(1) + " first name = " + rs.getString(3) + " last name = "
					+ rs.getString(4));
		}
		System.out.println("\n");
		int n = 0;

		PreparedStatement ps = connection.prepareStatement(DELETE_VOLUNTEERS_QUERY);

		System.out.println("Enter no. of volunteers to delete");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Please enter Volunter ID#:");
			Integer volunteer_id = sc.nextInt();
			ps.setInt(1, volunteer_id);
		}
		int rows = ps.executeUpdate();

		if (rows > 0) {
			System.out.println(n + " records have been deleted from the volunteers database." + "\n");
		} else
			System.out.println("No records were updated.");

	}
	// @villarr - method for updating volunteers

	public void updateVolunteers() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_VOLUNTEERS_QUERY).executeQuery();
		while (rs.next()) {
			System.out.println("volunteer id = " + rs.getInt(1) + " first name = " + rs.getString(3) + " last name = "
					+ rs.getString(4));
		}
		System.out.println("\n");
		int n = 0;

		PreparedStatement ps = connection.prepareStatement(UPDATE_VOLUNTEERS_QUERY);

		System.out.println("Enter no. of volunteers to update");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Please enter Volunteer ID#");
			Integer pet_id = sc.nextInt();
			ps.setInt(2, pet_id);

		}
		int rows = ps.executeUpdate();

		if (rows > 0) {
			System.out.println(n + " records have been updated in the volunteers database." + "\n");
		} else
			System.out.println("No records were updated.");

	}
	// @villarr - method for getting volunteers

	public void getVolunteers() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_VOLUNTEERS_QUERY).executeQuery();
		while (rs.next()) {
			System.out.println("volunteer id = " + rs.getInt(1) + " location = " + rs.getString(2) + " first name = "
					+ rs.getString(3) + " last name = " + rs.getString(4) + " phone number = " + rs.getString(5) + "\n");
		}

	}
}
