package indra.talentCamp.ejercicioBanco;
import java.util.List;

public class CuentaCorriente extends CuentaBancaria{

	//saldo al descubierto y tener tener saldo negativo
	
	 CuentaCorriente( Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extraer(double monto) {
		
		this.getMovimientos().add(new Movimiento(-monto));
		if (this.getSaldo() <0) {
			System.out.println("Estás en números rojos");
		}
		
	}
	
	@Override
	public void extraer(double monto, String concepto) {
		this.getMovimientos().add(new Movimiento(-monto, concepto));
		if (this.getSaldo() <0) {
			System.out.println("Estás en números rojos");
		}
	}

}
