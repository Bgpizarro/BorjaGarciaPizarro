package indra.talentCamp.ejercicioBanco;
import java.time.*;
public abstract class Movimiento {

	private LocalDate fecha;
	private double saldo;//positivo deposito, negativo extraccion
	
	
	public Movimiento(int movRealizado,String fechaMov ) {
		super();
		this.fecha = LocalDate.now();
		this.saldo = movRealizado;
	}
	
	
	
	public LocalDate getFechaMov() {
		return fecha;
	}
	public double getMovRealizado() {
		return saldo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "...";
	}
}
