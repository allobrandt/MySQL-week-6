package entity;

public class Shelters {

	private int location_id;
	private char clinic_onsite;
	private int number_of_cats;
	private int number_of_dogs;
	
	public Shelters(int location_id, char clinic_onsite,int number_of_cats, int number_of_dogs)	{
		this.setLocation_id(location_id);
		this.setClinic_onsite(clinic_onsite);
		this.setNumber_of_cats(number_of_cats);
		this.setNumber_of_dogs(number_of_dogs);
		
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public char getClinic_onsite() {
		return clinic_onsite;
	}

	public void setClinic_onsite(char clinic_onsite) {
		this.clinic_onsite = clinic_onsite;
	}

	public int getNumber_of_cats() {
		return number_of_cats;
	}

	public void setNumber_of_cats(int number_of_cats) {
		this.number_of_cats = number_of_cats;
	}

	public int getNumber_of_dogs() {
		return number_of_dogs;
	}

	public void setNumber_of_dogs(int number_of_dogs) {
		this.number_of_dogs = number_of_dogs;
	}
}
