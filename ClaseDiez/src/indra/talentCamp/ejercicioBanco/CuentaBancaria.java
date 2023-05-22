package indra.talentCamp.ejercicioBanco;
import java.util.*;

public abstract class CuentaBancaria {

	private static int ULTIMO_NUMERO=1;
	private int numeroCuenta;
	//private double saldo;
	private Cliente propietario;
	private List<Movimiento> movimientos;
	
	
	//Si no pongo nada es private, pero un private especial que se llama package-private
	CuentaBancaria(Cliente cliente) {
		super();
		this.numeroCuenta = CuentaBancaria.ULTIMO_NUMERO;
		CuentaBancaria.ULTIMO_NUMERO++;
		//this.saldo = 0;
		this.propietario = cliente;
		this.movimientos = new ArrayList<>();
	}

	public int getNumeroCuenta() {return numeroCuenta;}
	
	public double getSaldo() {
		return movimientos.stream().mapToDouble(movimiento->movimiento.getMovRealizado()).sum();
	}

	public Cliente getPropietario() {return propietario;}
	public List<Movimiento> getMovimientos() {return Collections.unmodifiableList(movimientos);}
	
	
	public void depositar(double monto) {
		movimientos.add(new Movimiento(monto));
	}
	
	public void depositar(double monto, String motivo) {
		movimientos.add(new Movimiento(monto, motivo));
	}
	
	public abstract void extraer(double monto) throws SaldoInsuficienteException;
	
	public abstract void extraer(double monto, String concepto) throws SaldoInsuficienteException;
}
