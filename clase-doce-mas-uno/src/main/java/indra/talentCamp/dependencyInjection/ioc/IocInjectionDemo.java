package indra.talentCamp.dependencyInjection.ioc;

public class IocInjectionDemo {

	public static void aTodoGas() {
		
		BeanFactoryV1 factory=new BeanFactoryV1();
		factory.registerRepository(new DatabaseRepository());
		
		BeanFactoryV2 factoryV2= new BeanFactoryV2();
		factoryV2.registerDependency(PartyService.class, "repository", DatabaseRepository.class);
		
		PartyService service = factory.createPartyService();
		service.haveFun();
		
		PartyService servicev2=(PartyService)factoryV2.createBean(PartyService.class);
		servicev2.haveFun();
	}
}
