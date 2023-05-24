package indra.talentCamp.layers;

import java.awt.Color;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistance.JediFileRepository;
import indra.talentCamp.layers.persistance.NotFoundException;
import indra.talentCamp.layers.persistance.SaveErrorException;

public class App {

	public static void main(String[] args) throws SaveErrorException {

		System.out.println("Bienvenidos a una hermosa nueva clase");

		JediFileRepository prueba=new JediFileRepository();
		/*
		try {
		prueba.save(new Jedi("anakin",10000,Color.BLUE));
	
		}catch(Exception e) {
			throw new SaveErrorException();
		}
		*/
		Jedi jedi;
		try {
			jedi=prueba.findById(1);
			System.out.println(jedi);
		}catch(NotFoundException e) {
			e.printStackTrace();
		}
	}
}
