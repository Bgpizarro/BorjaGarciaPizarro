package indra.talentCamp.generics;

public class RectanguloInteger extends FiguraGenerica<Integer> {
	
	private int base;
	private int altura;
	
	public RectanguloInteger(int base, int altura) {
		super();
		this.base=base;
		this.altura=altura;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public Integer calcularArea() {
		
		return base*altura;
	}
	
	@Override
	public Integer calcularPerimetro() {
		
		return base*2+altura*2;
	}
}
