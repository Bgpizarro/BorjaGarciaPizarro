package indra.talentCamp.ejercicioBanco;
import java.util.*;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private int identificador;
	//private List<CuentaBancaria> cuentas;
	
	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
		//this.cuentas = new ArrayList<>();
	}
	
	public Cliente(int identificador, String nombre, String apellido) {
		super();
		this.identificador=identificador;
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	
	public Cliente() {
		
	}

	public String getNombre() {
		return nombre;
	}


	public int getIdentificador() {
		return identificador;
	}

	public String getApellido() {
		return apellido;
	}
	
	
	
	
}
