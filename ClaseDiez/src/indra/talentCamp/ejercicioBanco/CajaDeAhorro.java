package indra.talentCamp.ejercicioBanco;
import java.util.List;

public class CajaDeAhorro extends CuentaBancaria{

	CajaDeAhorro( Cliente cliente) {
		super( cliente);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void extraer(double monto)throws SaldoInsuficienteException {
		//(this.getSaldo()<monto)?throw new SaldoInsuficienteException():this.getMovimientos().add(new Movimiento(monto));
		 if (this.getSaldo() >= monto) {
	            this.getMovimientos().add(new Movimiento(-monto));
	        } else {
	            throw new SaldoInsuficienteException();
	        }
	}
	
	@Override
	public void extraer(double monto, String concepto) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		if (this.getSaldo() >= monto) {
            this.getMovimientos().add(new Movimiento(-monto, concepto));
        } else {
            throw new SaldoInsuficienteException();
        }
	}

}
