package indra.talentCamp.interfaces;

public class Triangulo extends Figura {
	
	private double lado1,lado2, altura, base;

	public Triangulo(double altura, double base,double lado1, double lado2) {
		super();
		this.altura = altura;
		this.base = base;
		this.lado1=lado1;
		this.lado2=lado2;
	}

	
	@Override
	public double calcularArea() {
		
		return base*altura/2;
	}

	@Override
	public double calcularPerimetro() {
		
		return lado1+lado2+base;
	}

}
