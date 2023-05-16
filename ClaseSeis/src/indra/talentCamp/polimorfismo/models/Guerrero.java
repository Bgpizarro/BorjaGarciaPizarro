package indra.talentCamp.polimorfismo.models;

public class Guerrero extends Jugador {
	
	public Guerrero(String nombre) {
		super(nombre);
	}
	
	@Override
	public void accion(Jugador enemigo){
		System.out.format("%s ataca a %s y hace %d de daño", 
				this.getNombre(),
				enemigo.getNombre(),
				this.getFuerza());
		enemigo.setHp(enemigo.getHp()-this.getFuerza());
		System.out.println();
	}
}
