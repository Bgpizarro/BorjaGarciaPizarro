import java.io.*;
import java.util.*;

import indra.utils.Consola;
import java.util.Scanner;

public class Program {

////	public static void main(String[] args)  {
////	try {
////		//Como el main no tiene throws, tengo que usar un try catch
////		Program.ejemploBufferedReaderConThrows();
////	} catch (IOException e) {
////		e.printStackTrace();
////	}
////}
//
//	public static void main(String[] args)  {
//		
//	//Es numero
////		try(Scanner in= new Scanner(System.in)){
////			System.out.println("Ingresa número");
////			String num=in.nextLine();
////			if(esNumerico(num)){
////				System.out.println("Es numero");
////			}else {
////				System.out.println("No es un número");
////			}
////		}
//		
//	//Leer en bucle hasta introducir número
//		//System.out.println("Tu número es: "+ readInt());
//		
//	//Con sobrecarga
//		int num=readIntConTexto("Ingrese un número");
//		System.out.println("Su número es: "+num);
//	}
	
	public static void Random() {
		System.out.println("Tienes 5 intentos");
		System.out.println("Adivina el número de 1 a 100");
		Random r= new Random();
		int azar=r.nextInt(1,100);
		int intentos=5, num=-1;
					
		while(intentos>0){
			
			num=Consola.readInt();
				
			if(num>azar) {
				System.out.println("el tuyo es mas grande");
			}else if(num<azar) {
				System.out.println("el tuyo es mas pequeño");
			}else {
				System.out.println("Acertaste");
				return;
			}
			intentos--;
			
		}
		System.out.println("El número era: "+ azar);
	}
	
	public static void adivinanzas() {
		//TODO
	}
	
	public static void primo() {
		int resto=0;
		int num=Consola.readInt();
		for(int i=num-1;i>1;i--) {
			resto=num%i;
			if(resto==0) {
				System.out.println("No es primo");
				return;
			}
		}
		System.out.println("Es primo");
	}
	
	public static void main(String[] args) {
//		int num=Consola.readIntConTexto("Ingrese un número");
//		System.out.println("Su número es: "+ num);
		
		//5 intentos acertar numero random
		//Random();
		
		
		//dado un numero si es primo
		
		//primo();
		
		
	}
}
