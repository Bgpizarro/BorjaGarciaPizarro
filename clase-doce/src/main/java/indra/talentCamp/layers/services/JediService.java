package indra.talentCamp.layers.services;

import java.awt.Color;
import java.util.Random;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistance.JediMockRepository;
import indra.talentCamp.layers.persistance.SaveErrorException;
import indra.talentCamp.layers.persistance.interfaces.Repository;

public class JediService {
	private Repository<Jedi> repository;
	
	public JediService(Repository<Jedi> repo) {
		this.repository=repo;
	}

	private int calcularNivelFuerza(Jedi j) {
		return new Random().nextInt(100,100000);
	}
	
	private Color crearSableNuevo() {
		return Color.GREEN;
	}
	
	public void alistar(String nombre) throws SaveErrorException {
		Jedi nuevo=new Jedi(nombre,this.crearSableNuevo());
		nuevo.setNivelDeFuerza(this.calcularNivelFuerza(nuevo));
		
			this.repository.save(nuevo);
		
	}
}
