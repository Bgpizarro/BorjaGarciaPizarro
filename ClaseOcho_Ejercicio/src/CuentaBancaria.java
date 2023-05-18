import java.util.*;

public abstract class CuentaBancaria {

	private int numeroCuenta;
	private double saldo;
	private Cliente propietario;
	private List<Movimiento> movimientos;
	
	
	public CuentaBancaria(int numeroCuenta, double saldo, Cliente cliente, List<Double> movimientos) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.propietario = cliente;
		this.movimientos = new ArrayList<>();
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public Cliente getCliente() {
		return propietario;
	}
	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	
	public abstract void depositar(double monto);
	
	public abstract void extraer(double monto);
}
