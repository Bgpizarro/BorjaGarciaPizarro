package indra.talentCamp.polimorfismo.models;

public abstract class Jugador {
	private String nombre;
	private int hp;
	private int fuerza;
	private int modFuerza;
	private int destreza;
	
	//private int tipoJugador=1;//1-guerrero, 2-sacerdote, 3-mago
	
	public Jugador(String nombre) {
		this.nombre=nombre;
		this.hp=50;
		this.fuerza=50;
		this.destreza=50;
		this.modFuerza=0;
		
	}
	
	public boolean estaVivo() {return (this.hp>0);}

	public int getHp() {return hp;}
	protected void setHp(int hp) {this.hp = hp;}

	public int getFuerza() {return fuerza+modFuerza;}
	protected void setFuerza(int fuerza) {this.fuerza = fuerza;}

	public int getDestreza() {return destreza;}
	protected void setDestreza(int destreza) {this.destreza = destreza;}

	public String getNombre() {return nombre;}
	
	public int getModFuerza() {return modFuerza;}
	protected void setModFuerza(int modFuerza) {this.modFuerza=modFuerza;}
	
	public abstract void accion(Jugador enemigo); //{
//		if(tipoJugador==1) {
//			enemigo.setHp(enemigo.getHp()-this.getFuerza());
//		}else if(tipoJugador==2) {
//			enemigo.setHp(enemigo.getHp()+this.getDestreza());
//		}else if(tipoJugador==3) {
//			enemigo.setFuerza(enemigo.getFuerza()-this.getDestreza());
//		}
	//}
	
	@Override
	public String toString() {
		return String.format("Nuestro personaje %s llamado %s\n"
				+ "Tiene salud: %d,\nTiene una destreza: %d, \nTiene fuerza : %d",
				this.getClass().getSimpleName(),
				this.getNombre(),
				//this.tipoJugador,
				this.getHp(),
				this.getDestreza(),
				this.getFuerza());
	}

	public void finalizarTurno() {
		this.modFuerza=0;
	}
}
