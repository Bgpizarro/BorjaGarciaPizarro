package indra.talentCamp.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console {
	
	public static void ejemploBufferedReaderConThrows() throws IOException{
		
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
				
			
			System.out.println("Ingresa tu nombre: ");
			
			//try {
				String nombre =reader.readLine();
				System.out.println("Ingresa tu edad: ");
				String edad =reader.readLine();
				int age= Integer.parseInt(edad);
				
				System.out.println("Hola "+ nombre);
				System.out.println("Cuya edad es "+ age);
			
			//} catch(IOException e) {
				//System.out.println(e.getMessage());
			//}
			
		} finally {
			System.out.println("Cerrando el BufferedReader");
			reader.close();
		}
	}
	
	public static void ejemploBufferedReaderSinThrows() {
		
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
				
			
			System.out.println("Ingresa tu nombre: ");
			
			try {
				String nombre =reader.readLine();
				System.out.println("Ingresa tu edad: ");
				String edad =reader.readLine();
				int age= Integer.parseInt(edad);
				
				System.out.println("Hola "+ nombre);
				System.out.println("Cuya edad es "+ age);
			
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Cerrando el BufferedReader");
			try {
			reader.close();
			} catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	

	public static void ejemploScanner() {
		try(Scanner in= new Scanner(System.in)){
			System.out.println("Su nombre es...");
			String nombre=in.nextLine();
			System.out.println("Su edad es...");
			int edad=in.nextInt();
			System.out.println("Hola "+nombre+" de "+edad+" años");
		}//hace él solo un close24
	}
	
	public static boolean esNumerico(String numero) {
		try {
			Integer.parseInt(numero);
			return true;
			}catch(NumberFormatException e){
				return false;
			}
	}
	
	public static int readInt() {
		String num=null;
		try{	
			Scanner in= new Scanner(System.in);
			do {
				System.out.println("Ingresa número");
				num=in.nextLine();
			}while(!esNumerico(num));
			
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		return Integer.valueOf(num);
	}
	
	public static int readIntConTexto(String prompt) {
		String num=null;
		try{	
			Scanner in= new Scanner(System.in);
			do {
				System.out.println(prompt);
				num=in.nextLine();
			}while(!esNumerico(num));
			
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		return Integer.valueOf(num);
		
	}
	
	public static String readString(String prompt) {
		Scanner in=new Scanner(System.in);
		
		String entrada="";
		do {
			System.out.println(prompt);
			entrada=in.nextLine();
		}while(entrada.length()==0);
		
		return entrada;
	}
	
}