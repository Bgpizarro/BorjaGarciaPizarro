package indra.talentCamp.dependencyInjection.field;

public class FieldInjectionDemo {

	public static void aTodoGas() {
		
		PartyService service = new PartyService();
		service.setRepository(new DatabaseRepository());
		
		service.haveFun();
	}
}
