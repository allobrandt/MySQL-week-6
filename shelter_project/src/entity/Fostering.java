package entity;

import java.sql.Date;

public class Fostering {

	private int fostering_id;
	private int pet_id;
	private int volunteer_id;
	private java.sql.Date foster_date;

	public Fostering(int fostering_id, int pet_id, int volunteer_id, java.sql.Date foster_date) {
		this.setFostering_id(fostering_id);
		this.setPet_id(pet_id);
		this.setVolunteer_id(volunteer_id);
		this.setFoster_date(foster_date);
	}

	public int getFostering_id() {
		return fostering_id;
	}

	public void setFostering_id(int fostering_id) {
		this.fostering_id = fostering_id;
	}

	public int getPet_id() {
		return pet_id;
	}

	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}

	public int getVolunteer_id() {
		return volunteer_id;
	}

	public void setVolunteer_id(int volunteer_id) {
		this.volunteer_id = volunteer_id;
	}

	public java.sql.Date getFoster_date() {
		return foster_date;
	}

	public void setFoster_date(java.sql.Date foster_date) {
		this.foster_date = foster_date;
	}
}