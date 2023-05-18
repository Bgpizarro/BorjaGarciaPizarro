import java.util.List;

public class CuentaCorriente extends CuentaBancaria{

	public CuentaCorriente(int numeroCuenta, double saldo, Cliente cliente, List<Double> movimientos) {
		super(numeroCuenta, saldo, cliente, movimientos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extraer(double monto) {
		// TODO Auto-generated method stub
		
	}

}
