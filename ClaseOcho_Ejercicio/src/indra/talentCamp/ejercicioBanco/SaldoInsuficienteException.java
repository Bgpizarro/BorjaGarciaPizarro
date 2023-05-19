package indra.talentCamp.ejercicioBanco;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID=1L;
	
	public SaldoInsuficienteException() {
		super("No posee saldo para realizar la operación");
	}
	
}
