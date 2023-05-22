package indra.talentCamp.ejercicioBanco;
import java.util.*;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private int identificador;
	//private List<CuentaBancaria> cuentas;
	
	/*
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
	*/
	
	private Cliente() {
		super();
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
	
	

	//InnerClass
	public static class ClienteBuilder{
		private String nombre=null;
		private String apellido=null;
		private int identificador=0;
		
		//Setters con Fluent Interfaces
		public ClienteBuilder setNombre(String nombre) {this.nombre= nombre; return this;}

		public ClienteBuilder setIdentificador(int identificador) {this.identificador=identificador; return this;}

		public ClienteBuilder setApellido(String apellido) {this.apellido=apellido; return this;}
		
		public Cliente build() {
			
			assert this.nombre!=null;
			assert this.apellido!=null;
			assert this.identificador>0; 
			//Si no se cumple la condicion se hace un throw de AssertionError
			
			Cliente c=new Cliente();
			c.identificador=this.identificador;
			c.nombre=this.nombre;
			c.apellido=this.apellido;
			return c;
		}
		
	}
	//Dentro del Cliente
	public static ClienteBuilder builder() {
		return new ClienteBuilder();
	}
	
	
}
