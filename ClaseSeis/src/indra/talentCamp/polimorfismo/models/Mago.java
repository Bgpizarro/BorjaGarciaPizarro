package indra.talentCamp.polimorfismo.models;

public class Mago extends Jugador {

	private int poderMagico;
	private int mana;
	
	public Mago(String nombre) {
		super(nombre);
		
		poderMagico=10;
		mana=100;
	}
	

	public int getPoderMagico() {return poderMagico;}
	
	public void setPoderMagico(int poderMagico) {this.poderMagico = poderMagico;}
	
	public int getMana() {return mana;}
	
	public void setMana(int mana) {this.mana = mana;}
	
@Override
	public void accion(Jugador enemigo) {
		
		if(mana>poderMagico) {
			System.out.format("%s tira un hechizo a %s y modifica su fuerza", 
					this.getNombre(),
					enemigo.getNombre()
					);
			System.out.println();
			
		enemigo.setModFuerza(-this.getPoderMagico());
		this.mana-=this.getPoderMagico();
		}	
	}

	@Override
	public void finalizarTurno() {
		// ESte es otro escenario donde, en vez de reemplazar el comportamiento, lo extiendo
		super.finalizarTurno();
		this.setMana(this.getMana()+1);
	}

}
