package indra.talentCamp.polimorfismo;

import java.util.*;
import indra.talentCamp.polimorfismo.models.*;

public class Program {

	public static void main(String[] args) {
		
		Jugador excalibur=new Guerrero("Excalibur");
		Jugador batman= new Guerrero("Batman");
		Jugador thanos=new Mago("Thanos");
		
		List<Jugador> personajes=new ArrayList<Jugador>();
		personajes.add(excalibur);
		personajes.add(batman);
		personajes.add(thanos);
		
		//comienzo del turno
		System.out.println("Comienzo del turno");
		personajes.forEach(System.out::println);
		
		batman.accion(excalibur);
		thanos.accion(excalibur);
		
		personajes.forEach(System.out::println);
		//personajes.forEach(p->p.finalizarTurno());
		
		//fin del turno
		System.out.println("--------------");
		System.out.println("Fin del turno");
		personajes.forEach((p)->{
			p.finalizarTurno();
			System.out.println(p);
		});
		
		System.out.println("Estan vivos: ");
		personajes.stream().filter(alive->alive.estaVivo()).forEach(System.out::println);		
		/*
		Animal perro=new Perro();
		Animal gato=new Gato();
		Animal vaca=new Vaca();
		
		List<Animal> animales=new ArrayList<Animal>();
		animales.add(perro);
		animales.add(gato);
		animales.add(vaca);
		
		animales.forEach(s->s.hacerSonido());
		*/
		

	}

}
