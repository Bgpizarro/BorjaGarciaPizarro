package indra.talentCamp.polimorfismo.models;

public class Sacerdote extends Jugador {
	

	public Sacerdote(String nombre) {
		super(nombre);
	}
	
	@Override
	public void accion(Jugador enemigo) {
		
		
			System.out.format("%s cura a %s por %d puntos de vida", 
					this.getNombre(),
					enemigo.getNombre(),
					this.getDestreza()
					);
			System.out.println();
		enemigo.setHp(enemigo.getHp()+this.getDestreza());
	}
}
