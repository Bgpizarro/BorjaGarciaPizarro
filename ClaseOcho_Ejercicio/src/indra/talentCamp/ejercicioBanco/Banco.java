package indra.talentCamp.ejercicioBanco;
import java.util.*;

public class Banco {

	private List<CuentaBancaria> cuentas;
	//private List<Cliente> clientes=new ArrayList<>();
		//puede lista cliente
	
	public Banco(List<CuentaBancaria> cuentas) {
		cuentas=new ArrayList<>();
	}
	
	
	
	public CajaDeAhorro crearCajaDeAhorro(Cliente cliente) {
		CajaDeAhorro cuenta=new CajaDeAhorro(cliente);
		this.cuentas.add(cuenta);
		return cuenta;
	}
	
	public CuentaCorriente crearCuentaCorriente(Cliente cliente) {
		CuentaCorriente cuenta=new CuentaCorriente(cliente);
		this.cuentas.add(cuenta);
		return cuenta;
	}



	public List<CuentaBancaria> getCuentas() {
		return Collections.unmodifiableList(cuentas);
	}

	public CuentaBancaria buscarCuenta(int numeroCuenta) {
		return this.cuentas.stream().filter(c->c.getNumeroCuenta()==numeroCuenta).findFirst().orElse(null);
	}
	
}
