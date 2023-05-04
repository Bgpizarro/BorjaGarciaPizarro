
public class Program {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		int numero=20;
		System.out.println(numero);
		
		double medio=0.5;
		System.out.println(medio);
		
		boolean verdadero=true;
		System.out.println(verdadero);
		
		//tipos de datos de objetos
		String nombre="Esteban";
		System.out.println(nombre);
		
		@SuppressWarnings("removal")
		Integer num= new Integer(2);
		System.out.println(num);
		
		//conversion de tipos
		//numero=medio; no compila
		
		medio=numero;//conversion implicita
		
		String enLetras=Integer.toString(numero);//conversion explicita
		System.out.println("convertido: "+ enLetras);
		
		System.out.printf("convertido a letras es %s", enLetras);
		System.out.println();
		System.out.printf("convertido a letras es %d", numero);
		System.out.println();
		
		enLetras="22";
		numero=Integer.parseInt(enLetras);//conversion explicita
		System.out.println(enLetras);
		
		//captura de excepciones
		try {
			enLetras="22dos";
			numero=Integer.parseInt(enLetras);
		//}catch(Exception ex) {
		}catch(NumberFormatException ex) {
			System.out.println("no se pudo hacer la conversion de "+enLetras+" a int");
		}
		
		//convierto un string con un numero decimal en una variable float
		String dec="0.5";
		float decf=Float.parseFloat(dec);
		System.out.println(decf);
	}
}
