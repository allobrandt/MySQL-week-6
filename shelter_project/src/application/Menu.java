package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.AnimalsDAO;
import dao.FosteringDAO;
import dao.VolunteersDAO;
import dao.SheltersDAO;

public class Menu {

	private AnimalsDAO animalDAO = new AnimalsDAO();
	private VolunteersDAO volunteerDAO = new VolunteersDAO();
	private SheltersDAO shelterDAO = new SheltersDAO();
	private FosteringDAO fosterDAO = new FosteringDAO();
	private Scanner scanner = new Scanner(System.in);

	private List<String> options = Arrays.asList("Display Animals", "Display Foster Program Volunteers",
			"Display Shelter Locations", "Display Current Fosters", "Add New Animal", "Delete Animal",
			"Add New Volunteer", "Delete Volunteer", "Add New Foster Record", "Delete Foster Record");

	public void start() throws SQLException {
		String selection = "";

		// @allobrandt - Do/While loop - everything in the "do" brackets should run at
		// least once
		do {
			printMenu();
			selection = scanner.nextLine();

			if (selection.equals("0")) {
				displayAnimals();
			} else if (selection.equals("1")) {
				displayVolunteers();
			} else if (selection.equals("2")) {
				displayShelters();
			} else if (selection.equals("3")) {
				displayFostering();
			} else if (selection.equals("4")) {
				createAnimals();
			} else if (selection.equals("5")) {
				createVolunteers();
			} else if (selection.equals("6")) {
				deleteAnimals();
			} else if (selection.equals("7")) {
				deleteVolunteers();
			} else if (selection.equals("8")) {
				createFostering();
			} else if (selection.equals("9")) {
				deleteFostering();
			}

			System.out.println("Press enter to continue.");
			scanner.nextLine();

		} while (!selection.equals("-1"));

	}

	private void deleteFostering() {
		fosterDAO.deleteFostering();
	}

	private void createFostering() throws SQLException {
		fosterDAO.getFostering();
	}

	private void deleteVolunteers() throws SQLException {
		volunteerDAO.deleteVolunteers();
	}

	private void deleteAnimals() throws SQLException {
		animalDAO.deleteAnimals();
	}

	private void createVolunteers() throws SQLException {
		volunteerDAO.getVolunteers();
	}

	private void createAnimals() throws SQLException {
		animalDAO.createAnimals();

	}

	private void displayFostering() throws SQLException {
		fosterDAO.getFostering();
	}

	private void displayShelters() throws SQLException {
		shelterDAO.getShelters();

	}

	private void displayVolunteers() throws SQLException {
		volunteerDAO.getVolunteers();

	}

	private void displayAnimals() throws SQLException {
		animalDAO.getAnimals();
	}

	private void printMenu() {
		System.out.println("Please select an option:\n ~ * ~ * ~ * ~ * ~");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + ") " + options.get(i));
		}
	}
}
