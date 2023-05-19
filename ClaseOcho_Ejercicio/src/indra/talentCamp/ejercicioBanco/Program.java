package indra.talentCamp.ejercicioBanco;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  List<String> nombres = new ArrayList<>();
				
		//inmodificable
		//Arrays.asList("Juan","Pedro","Ramiro");
		nombres.add("Esteban");
		
		//no se puede modificar la lista
		nombres=Collections.unmodifiableList(nombres);
		
		//UnsupportedOperationException
		//nombres.add("Otro mas");
		 */
		  
		CuentaBancaria c= new CajaDeAhorro(new Cliente());
		c.getMovimientos().add(new Movimiento(1000));
	}

}
