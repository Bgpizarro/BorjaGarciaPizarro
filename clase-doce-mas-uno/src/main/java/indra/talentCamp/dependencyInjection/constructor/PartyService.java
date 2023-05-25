package indra.talentCamp.dependencyInjection.constructor;

public class PartyService {

	private Repository repository;
	
	public PartyService(Repository databaseRepository) {
		this.repository=databaseRepository;
	}

	public void haveFun() {
		assert this.repository!=null;
		System.out.println("Everybody have fun tonight");
		System.out.println("guardemos en repo");
		this.repository.save();
	}
	
	public void setRepository(Repository r) {
		this.repository=r;
	}
}
