package indra.talentCamp.ejercicioBanco;
import java.util.*;

public class Banco {

	private List<CuentaBancaria> cuentas;
	//private List<Cliente> clientes=new ArrayList<>();
		//puede lista cliente
	
	public Banco(List<CuentaBancaria> cuentas) {
		cuentas=new ArrayList<>();
	}
	
	
	
	public void crearCajaDeAhorro(Cliente cliente) {
		cuentas.add(new CajaDeAhorro(cuentas.size(),cliente));
	}
	
	public void crearCuentaCorriente(Cliente cliente) {
		cuentas.add(new CuentaCorriente(cuentas.size(),cliente));
	}

	
}
