package indra.talentCamp.database.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import indra.talentCamp.database.models.Persona;
import lombok.Getter;
import lombok.Setter;

public class PersonaRepository implements Repository<Persona>{

	@Getter @Setter
	private String connectionString=null;

	@Override
	public void save(Persona nuevo) throws SaveErrorException {
		// TODO Auto-generated method stub
		throw new Error("Not implemented yet");
	}

	@Override
	public void update(Persona existente) throws UpdateErrorException {
		// TODO Auto-generated method stub
		throw new Error("Not implemented yet");
	}

	@Override
	public void delete(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		throw new Error("Not implemented yet");
	}

	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
        List<Persona> result = new ArrayList<Persona>();
        
        try {
            try {
                //conn = DriverManager.getConnection("jdbc:sqlite:indra.db");
                conn=DriverManager.getConnection(this.connectionString);
                                                
                Statement select = conn.createStatement();
                ResultSet resultSet = select.executeQuery("SELECT * FROM Persona");
                while(resultSet.next()) {
                    
                    Persona pe = new Persona();
                    pe.setId(resultSet.getInt("id"));
                    pe.setNombre(resultSet.getString("nombre"));
                    pe.setEdad(resultSet.getInt("edad"));
                    
                    result.add(pe);
                }
                
            } finally {
                if (conn != null) {
                    conn.close();
                }
            }
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
        
        return result;

	}

	@Override
	public Persona findById(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		throw new Error("Not implemented yet");
	}

}
