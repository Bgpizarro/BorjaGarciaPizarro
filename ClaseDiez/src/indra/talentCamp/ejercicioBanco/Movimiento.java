package indra.talentCamp.ejercicioBanco;
import java.time.*;
public class Movimiento {

	private LocalDate fecha;
	private double saldo;//positivo deposito, negativo extraccion
	private String motivo;
	
	public Movimiento(double movRealizado) {
		super();
		this.fecha = LocalDate.now();
		this.saldo = movRealizado;
		this.motivo=(movRealizado > 0)? "Deposito" : "Extracción";
	}
	
	public Movimiento(double movRealizado, String motivo) {
		super();
		this.fecha = LocalDate.now();
		this.saldo = movRealizado;
		this.motivo=motivo;
	}
	
	public LocalDate getFechaMov() {
		return fecha;
	}
	public double getMovRealizado() {
		return saldo;
	}
	

	public String getMotivo() {
		return motivo;
	}
	
	public TipoDeMovimiento getTipo() {
		if(this.saldo>0)return TipoDeMovimiento.Deposito;
		
		return TipoDeMovimiento.Extraccion;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "...";
	}

}
