package indra.talentCamp.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.generics.CajaFuerte;
import indra.talentCamp.generics.Operacion;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<AreaCalculable> escenario=Arrays.asList(
				new Circulo(10.0),
				new Triangulo(15.0,12.0,16.36,16.36),
				new Rectangulo(10.0,10.0),
				new Planta());
		
		System.out.println("El area total es...");
		System.out.println(escenario.stream().mapToDouble(n->n.calcularArea()).sum());
		
	//Casteos
		
		//sSystem.out.println("El perimetro total es...");
		//System.out.println(escenario.stream().mapToDouble(n->n.calcularPerimetro()).sum());
		/*double perimetroTotal=0;
		for(AreaCalculable c: escenario) {
			//if(c instanceof Perimetro) {
			if(Perimetro.class.isInstance(c)) {
				//perimetroTotal+=((Perimetro)c).calcularPerimetro();
				perimetroTotal+=Perimetro.class.cast(c).calcularPerimetro();
			}
		}
		*/
		
	//Casteo con expresion lambda
		
		double perimetroTotal=escenario.stream().filter(Perimetro.class::isInstance)
				.map(Perimetro.class::cast)
				.mapToDouble(p->p.calcularPerimetro()).sum();
		
		System.out.println("Perimetro Total: "+perimetroTotal);
		
		//escenario.stream().forEach(System.out::println);
		List<Figura> figuras=escenario.stream().filter(Figura.class::isInstance).map(Figura.class::cast)
				.collect(Collectors.toList());
		
		Collections.sort(figuras);
		figuras.forEach(System.out::println);	
		
		
	//Ejemplo de uso interfaz funcional
		Operacion<Integer> suma=(a,b)->(a+b);
		int res= suma.operar(2,2);
		System.out.println("Sumar 2+2 es "+res);
		
		OperacionInteger sumaInt=(a,b)->(a+b);
		int resInt=sumaInt.operar(2, 2);
		System.out.println("Sumar 2+2 es "+resInt);
		
		//Ejemplo caja fuerte
		CajaFuerte<String, String> claveTexto=new CajaFuerte<String,String>("Abrete Sesamo");
		claveTexto.GuardarValor("La clave del home banking");
		String claveOk=claveTexto.leerValor("Abrete Sesamo");
		System.out.println("La clave es: "+claveOk);
		
		System.out.println("Intentando acceder con una clave invalida");
		
		try {
			//String claveMal=claveTexto.leerValor("dasdasd");
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		//caja fuerte con int
		CajaFuerte<Integer,String> claveNum=new CajaFuerte<Integer,String>("Contra");
		claveNum.GuardarValor(34);
		Integer claveTry=claveNum.leerValor("Contra");
		System.out.println("La clave es: "+claveTry);
	}
}
