package entity;

public class Animals {

	private int pet_id;
	private int location_id;
	private String species;
	private String gender;
	private String immunized;


	public Animals(int pet_id, int location_id, String species, String gender, String immunized) {
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species2) {
		this.species = species2;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImmunized() {
		return immunized;
	}

	public void setImmunized(String immunized) {
		this.immunized = immunized;
	}
	
	public Animals(int pet_id, int location_id, String species, int age, String gender, String immunized) {
		super();
		this.pet_id = pet_id;
		this.location_id = location_id;
		this.species = species;
		this.gender = gender;
		this.immunized = immunized;
	}
	
}
