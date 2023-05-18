import java.util.*;

public class Cliente {
	
	private String nombre;
	private int identificador;
	private List<CuentaBancaria> cuentas;
	
	
	public Cliente(String nombre, int identificador) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
		this.cuentas = new ArrayList<>();
	}
	
	
}
