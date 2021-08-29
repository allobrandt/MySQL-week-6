package entity;

public class Animals {
	
	private int pet_id;
	private int location_id;
	private char species;
	private char gender;
	private char immunized;

	
	public Animals(int pet_id, int location_id, char species, char gender, char immunized) {
		this.setPet_id(pet_id);
		this.setLocation_id(location_id);
		this.setSpecies(species);
		this.setGender(gender);
		this.setImmunized(immunized);

		
	}

	public int getPet_id() {
		return pet_id;
	}

	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public char getSpecies() {
		return species;
	}

	public void setSpecies(char species) {
		this.species = species;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getImmunized() {
		return immunized;
	}

	public void setImmunized(char immunized) {
		this.immunized = immunized;
	}
}
