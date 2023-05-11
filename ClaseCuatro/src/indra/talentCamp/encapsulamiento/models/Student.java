package indra.talentCamp.encapsulamiento.models;

public class Student extends Person{
	
	private boolean prefersFrontEnd;
	
	
	public Student(String name, int document, String address, boolean prefersFrontEnd) {
		super(name, document, address);
		
		this.prefersFrontEnd = prefersFrontEnd;
	}
	
	public Student(String name, int document, String address){
		super(name,document,address);
		this.prefersFrontEnd=false;
	}
	
//	public String getName() { return this.name;}
//	//public void setName(String n) {this.name=n;}
//	
//	public int getDocument() {return document;}
//	//public void setDocument(int document) {this.document = document;}
//	
//	public String getAddress() {return address;}
//	public void setAddress(String address) {this.address = address;}
	
	public boolean getPrefersFrontEnd() {return prefersFrontEnd;}
	public void setPrefersFrontEnd(boolean prefersFrontEnd) {this.prefersFrontEnd = prefersFrontEnd;}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return this.getName()+" (Documento: "+ this.getDocument()+") "+"\n"+""
//				+ " ["+this.getAddress()+"]"+"\n"+(this.prefersFrontEnd?"Entusiasta de FrontEnd":"Fanatico backend");
		return String.format("%s (%d) \n [%s] \n %s",
				this.getName(),
				this.getDocument(),
				this.getAddress(),
				(this.prefersFrontEnd?"Entusiasta de FrontEnd":"Fanatico backend")
				);
	}
}
