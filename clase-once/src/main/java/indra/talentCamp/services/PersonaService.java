package indra.talentCamp.services;

import java.util.*;

import indra.talentCamp.models.Persona;
import indra.talentCamp.persistence.PersonaRepository;

public class PersonaService {

	private PersonaRepository repository;
	
	public PersonaService() {
		this.repository=new PersonaRepository();
	}
	
	public List<Persona> recuperarPersonas(){
		List<Persona> personas= this.repository.findAll();
		//Aqui programo los requerimientos tecnicos
		//Puedo eliminar las personas que el usuario actual no tiene permiso de ver
		//Puedo sacar las personas que no estan activas
		//Puedo hacer validaciones si tengo permisos para recuperar las personas
		//Puedo guardar un mensaje de log de que es lo que está pasando...
		
		return personas;
	}
	public void registrarPersonaNueva(Persona p) {
		
		if(p.getNombre()==null) {
			//throw new validation exception("falta el nombre")
		}
		this.repository.save(p);
	}
}
