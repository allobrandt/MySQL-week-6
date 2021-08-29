package entity;

public class Volunteers {

	private int volunteer_id;
	private int location_id;
	private String first_name;
	private String last_name;
	private String phone_number;

	
	public Volunteers(int volunteer_id, int location_id, String first_name, String last_name, String phone_number) {
		this.setVolunteer_id(volunteer_id);
		this.setLocation_id(location_id);
		this.setFirst_name(first_name);
		this.setLast_name(last_name);
		this.setPhone_number(phone_number);
	}

	public int getVolunteer_id() {
		return volunteer_id;
	}

	public void setVolunteer_id(int volunteer_id) {
		this.volunteer_id = volunteer_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

}
