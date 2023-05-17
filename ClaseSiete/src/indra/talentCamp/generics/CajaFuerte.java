package indra.talentCamp.generics;

public class CajaFuerte<T, S> {
	
	private S password;
	private T valor;
	
	public CajaFuerte(S password) {
		this.password=password;
	}
	
	public void GuardarValor(T valor) {
		this.valor=valor;
	}
	
	public T leerValor(S password) {
		if(password.equals(this.password)){
			return this.valor;
		}
		//Es mejor usar una excepcion pero pereza lo pongo asi...
		throw new Error("Acceso no autorizado");
	}
}
