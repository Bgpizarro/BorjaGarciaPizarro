package indra.talentCamp.encapsulamiento.models;

public class Teacher extends Person{
	
	private String preferedLanguage;
	
	public Teacher(String name, int document, String address, String preferedLanguage) {
		super(name, document, address);
		
		this.preferedLanguage = preferedLanguage;
	}
	
	public Teacher(String name, int document, String address){
		super(name, document, address);
		this.preferedLanguage="Nada";
	}
	
//	public String getName() { return this.name;}
//	//public void setName(String n) {this.name=n;}
//	
//	public int getDocument() {return document;}
//	//public void setDocument(int document) {this.document = document;}
//	
//	public String getAddress() {return address;}
//	public void setAddress(String address) {this.address = address;}
	
	public String getpreferedLanguage() {return preferedLanguage;}
	public void setpreferedLanguage(String preferedLanguage) {this.preferedLanguage = preferedLanguage;}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return this.getName()+" (Documento: "+ this.getDocument()+") "+"\n"+""
//				+ " ["+this.getAddress()+"]"+"\n"+"Especialista en "+this.preferedLanguage;
		
		return String.format("%s (%d) \n [%s] \n %s",
				this.getName(),
				this.getDocument(),
				this.getAddress(),
				this.preferedLanguage
				);
	}
}