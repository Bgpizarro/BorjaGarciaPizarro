package indra.talentCamp.dependencyInjection.field;

public class PartyService {

	private Repository repository=null;
	
	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		System.out.println("guardemos en repo");
		this.repository.save();
	}

	public void setRepository(Repository mockRepository) {
		// TODO Auto-generated method stub
		this.repository=mockRepository;
	}
}
