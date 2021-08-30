package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Animals;

public class AnimalsDAO {

	// @allobrandt - reduced Animals table only includes fields: pet_id,
	// location_id, species, gender, immunized
	private Connection connection;
	private final String GET_ANIMALS_QUERY = "SELECT * FROM animals";
	private final String CREATE_ANIMALS_QUERY = "INSERT INTO animals (pet_id, location_id, species, gender, immunized) VALUES(?,?,?,?,?)";
	private final String DELETE_ANIMALS_QUERY = "DELETE from animals WHERE pet_id = ?";
	private final String UPDATE_ANIMALS_QUERY = "UPDATE animals SET immunized = ? WHERE pet_id = ?";
	private Scanner scanner = new Scanner(System.in);

	public AnimalsDAO() {
		connection = DBConnection.getConnection();
	}

	public void createAnimals() throws SQLException {

		int n = 0;

		PreparedStatement ps = connection.prepareStatement(CREATE_ANIMALS_QUERY);

		System.out.println("Enter no. of animals to insert");
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter a new pet id > 1000 (int)");
			Integer pet_id = scanner.nextInt();

			System.out.println("Enter a location id 1-10(int)");
			Integer locationId = scanner.nextInt();

			System.out.println("Please indicate if this is a cat or a dog:");
			String species = scanner.next();
			
			System.out.println("Pet's Gender (Male/Female):");
			String gender = scanner.next();

			System.out.println("Has this pet been immunized? (Y/N)");
			String immunized = scanner.next();

			ps.setInt(1, pet_id);
			ps.setInt(2, locationId);
			ps.setString(3, species);
			ps.setString(4, gender);
			ps.setString(5, immunized);

		}
		int rows = ps.executeUpdate();

		if (rows > 0) {
			System.out.println("Pet information updated!" + "\n");
		} else
			System.out.println("No information was updated.");
	}

	// @villarr - method for deleting animals based on a pet id input.

	public void deleteAnimals() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_ANIMALS_QUERY).executeQuery();
		while (rs.next()) {
			System.out.println("pet id = " + rs.getInt(1));
		}
		System.out.println("\n");
		int n = 0;

		PreparedStatement ps = connection.prepareStatement(DELETE_ANIMALS_QUERY);

		System.out.println("Enter no. of animals to delete");
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Please enter Pet ID#");
			Integer pet_id = scanner.nextInt();
			ps.setInt(1, pet_id);
		}
		int rows = ps.executeUpdate();

		if (rows > 0) {
			System.out.println(n + " records have been deleted from the animals database." + "\n");
		} else
			System.out.println("No records were updated.");

	}

	// @villarr - method for updating immunization status of animals based on their
	// pet id.

	public void updateAnimals() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_ANIMALS_QUERY).executeQuery();
		while (rs.next()) {
			System.out.println("pet id = " + rs.getInt(1) + " pet name = " + rs.getString(4));
		}
		System.out.println("\n");
		int n = 0;

		PreparedStatement ps = connection.prepareStatement(UPDATE_ANIMALS_QUERY);

		System.out.println("Enter no. of animals to update");
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter an updated immunization status Y/N");
			String imm = scanner.next();
			ps.setString(1, imm);
			System.out.println("Enter a pet id to update 1 - 1000 (int)");
			Integer pet_id = scanner.nextInt();
			ps.setInt(2, pet_id);

		}
		int rows = ps.executeUpdate();

		if (rows > 0) {
			System.out.println(n + " records have been updated in the animals table." + "\n");
		} else
			System.out.println("No records were updated.");

	}
	// @villarr - method for reading in all animal data available.

	public void getAnimals() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_ANIMALS_QUERY).executeQuery();
		while (rs.next()) {
			System.out.println("pet id = " + rs.getInt(1) + " location = " + rs.getString(2) + " species = "
					+ rs.getString(3) + " gender = " + rs.getString(4) + " immunized = " + rs.getString(5) + "\n");
		}

	}
}
