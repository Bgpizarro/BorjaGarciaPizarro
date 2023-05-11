package indra.talentCamp.encapsulamiento;


import indra.talentCamp.encapsulamiento.models.*;
import indra.talentCamp.utils.Console;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner in= new Scanner(System.in);
		
		try {
			//Student padawan= new Student();
			
			
			//System.out.println("Como es su nombre?");
			//String nombre=in.nextLine();
			//padawan.setName(in.nextLine());
			//padawan.setName(Console.readString("Cual es su nombre?"));
			
			//System.out.println("Cual es su documento?");
			//int documento= Integer.parseInt(in.nextLine());
			//padawan.setDocument(Integer.parseInt(in.nextLine()));
			//padawan.setDocument(Console.readIntConTexto("Cual es su documento?"));
			
			//System.out.println("Cual es su direccion?");
			//String direccion=in.nextLine();
			//padawan.setAddress(in.nextLine());
			//padawan.setAddress(Console.readString("Cual es su direccion?"));
			
			//System.out.println("Te gusta el front? (S/N)");
			//String respuesta=in.nextLine();
			//boolean prefiereFront=(respuesta.equalsIgnoreCase("S"));
			//padawan.setPrefersFrontEnd(respuesta.equalsIgnoreCase("S"));
			//String respuesta=Console.readString("Te gusta el front? (S/N)");
			//padawan.setPrefersFrontEnd(respuesta.equalsIgnoreCase(respuesta));
			
			System.out.println("Bienvenidos al Talent Camp de Java");
		
			System.out.println("¿Quien da el curso?");
			
			Teacher jedi= new Teacher(Console.readString("Cual es su nombre?"),
					Console.readIntConTexto("Cual es su documento?"),
					Console.readString("Cual es su direccion?"));
			
			System.out.println("¿Quien lo estudia?");
			
			Student padawan= new Student(Console.readString("Cual es su nombre?"),
					Console.readIntConTexto("Cual es su documento?"),
					Console.readString("Cual es su direccion?"));
			String respuesta=Console.readString("Te gusta el front? (S/N)");
			padawan.setPrefersFrontEnd(respuesta.equalsIgnoreCase(respuesta));
			
//			System.out.println("Bienvenido "+ padawan.getName()+" al talent camp de Java");
//			System.out.println("Su documento es "+ padawan.getDocument()+" y vive en "+ padawan.getAddress());
//			if(padawan.getPrefersFrontEnd()) {
//				System.out.println("Esperemos que vayas a frontend luego");
//			}else {
//				System.out.println("Espero que vayas a backend");
//			}
			System.out.println("---------------------------------------");
			System.out.println("El profesor es: ");
			System.out.println(jedi);
			System.out.println("Asisten al curso: ");
			System.out.println(padawan);
			
		}finally {
			//in.close();
		}
		
	}

}
