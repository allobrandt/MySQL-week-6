package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Animals;

public class AnimalsDAO {

	private Connection connection;
	private final String GET_ANIMALS_QUERY = "SELECT * FROM animals";
	
	public AnimalsDAO() {
		connection = DBConnection.getConnection();
	}
	public List<Animals> getAnimals() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_ANIMALS_QUERY).executeQuery();
		List<Animals> animals = new ArrayList<Animals>();
		
		while (rs.next()) {
			animals.add(populateAnimals(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			//this section needs additional code to allow all fields to update, I think
		}
		
		return animals;
	}
	private Animals populateAnimals(int pet_id, int location_id, char species, char gender, char immunized) {
		return new Animals(pet_id, location_id, species, gender, immunized);
		//location_id needs to be updated to be a foreign key List<locations>
		
	}
	}
	
	
}
