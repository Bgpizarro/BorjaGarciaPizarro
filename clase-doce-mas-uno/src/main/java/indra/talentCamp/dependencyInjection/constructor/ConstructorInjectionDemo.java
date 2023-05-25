package indra.talentCamp.dependencyInjection.constructor;

public class ConstructorInjectionDemo {

	public static void aTodoGas() {
		
		//Tiempo de configuración
		PartyService service= new PartyService(new DatabaseRepository());
		
		//Tiempo de ejecucion
		service.haveFun();
	}
}
