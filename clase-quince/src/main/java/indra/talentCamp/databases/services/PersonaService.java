package indra.talentCamp.databases.services;

import java.util.*;

import indra.talentCamp.database.models.Persona;
import indra.talentCamp.database.persistance.PersonaRepository;
import lombok.*;

public class PersonaService {

	@Getter @Setter
	private PersonaRepository repository;
	
	public List<Persona> cracksDeJava(){
		return this.repository.findAll();
	}
}
