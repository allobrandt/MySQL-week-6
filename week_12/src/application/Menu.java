package application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display Animals", 
			"Display Foster Program Volunteers",
			"Display Shelter Locations",
			"Display Current Fosters",
			"Add New Animal",
			"Delete Animal",
			"Add New Volunteer",
			"Delete Volunteer",
			"Add New Foster Record",
			"Delete Foster Record");
	
	public void start() {
		String selection = "";
		
		do { 
			printMenu();
			selection = scanner.nextLine();
			
//			if (selection.equals("0")) {
//				displayAnimals();
//			} else if (selection.equals("1")) {
//				displayVolunteers();
//			} else if (selection.equals("2")) {
//				displayShelters();
//			} else if (selection.equals("3")) {
//				displayFostering();
//			} else if (selection.equals("4")) {
//				createAnimals();
//			} else if (selection.equals("5")) {
//				createVolunteers();
//			} else if (selection.equals("6")) {
//				deleteAnimals();
//			} else if (selection.equals("7")) {
//				deleteVolunteers();
//			} else if (selection.equals("8")) {
//				createFostering();
//			} else if (selection.equals("9")) {	
//				deleteFostering();
//			}
			
			System.out.println("Press enter to continue.");
			scanner.nextLine();
			
			//everything in the "do" brackets will run at least once
		} while (!selection.equals("-1"));

	}

	private void printMenu() {
		System.out.println("Please select an option:\n ~ * ~ * ~ * ~ * ~");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + ") " + options.get(i));
		}
	}
	
}

