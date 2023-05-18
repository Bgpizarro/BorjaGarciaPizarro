package indra.talentCamp.relaciones.composite;

public class Valor extends Operacion{

	private double valor;
	
	public Valor(double valor) {
		super();
		this.valor=valor;
	}
	
	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return this.valor;
	}
}
