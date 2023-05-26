package indra.talentCamp.dependencyInjection.reflection;

public class PartyService {

	static private Class<? extends Repository> repositoryClass=null;
	
	public static void registerRepositoryClass(Class<? extends Repository> repositoryClass) {
		PartyService.repositoryClass=repositoryClass;
	}
	
	private Repository repository;
	

	
	public PartyService() {
		if(PartyService.repositoryClass==null) {
			throw new Error("Te olvidaste de configurar el PartyService");
		}
		
		
		try {
			this.repository=(Repository)PartyService.repositoryClass.getConstructor().newInstance();
		}catch(Exception e ) {
			throw new Error("El constructor es privado");
		}
	}
	
	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		System.out.println("guardemos en repo");
		this.repository.save();
	}
}
