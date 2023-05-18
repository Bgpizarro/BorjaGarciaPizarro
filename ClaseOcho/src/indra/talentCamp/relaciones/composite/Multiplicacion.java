package indra.talentCamp.relaciones.composite;

public class Multiplicacion extends OperacionBinaria{

	public Multiplicacion(double operandoIzquierdo, double operandoDerecho) {
		super(operandoIzquierdo, operandoDerecho);
		// TODO Auto-generated constructor stub
	}

	public Multiplicacion(double operandoIzquierdo, Operacion operandoDerecho) {
		super(operandoIzquierdo, operandoDerecho);
		// TODO Auto-generated constructor stub
	}

	public Multiplicacion(Operacion operandoIzquierdo, double operandoDerecho) {
		super(operandoIzquierdo, operandoDerecho);
		// TODO Auto-generated constructor stub
	}

	public Multiplicacion(Operacion operandoIzquierdo, Operacion operandoDerecho) {
		super(operandoIzquierdo, operandoDerecho);
		
	}
	
	@Override
	public double calcular() {
		
		return this.operandoIzquierdo.calcular()*this.operandoDerecho.calcular();
	}

}
