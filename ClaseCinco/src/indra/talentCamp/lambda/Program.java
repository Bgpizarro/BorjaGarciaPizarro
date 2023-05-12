package indra.talentCamp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.lambda.models.Persona;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String frase="Que la fuerza "+ "esté contigo";
//		frase+= "esté";
//		frase+=" contigo";
		
		/*StringBuilder builder=new StringBuilder();
		builder.append("Que la fuerza");
		builder.append(" esté");
		builder.append(" contigo");
		
		System.out.println(builder.toString());*/
		
		//Uno a uno
//		List<Persona> jedis=new ArrayList<Persona>();
//		
//		jedis.add(new Persona("Anakin", 178));
//		jedis.add(new Persona("Yoda", 80));
//		jedis.add(new Persona("Ashoka", 165));
//		jedis.add(new Persona("Luke", 173));
		
		List<Persona> jedis=Arrays.asList(
				new Persona("Anakin", 178),
				new Persona("Yoda", 80),
				new Persona("Ashoka", 165),
				new Persona("Luke", 173));
		
		//System.out.println("Lista de jedis:");
		//Iterando
//		for(Persona jedi:jedis) {
//			System.out.println(jedi.getNombre());
//		}
		
		//Iterando con expresiones lambda
		//jedis.forEach(jedi->System.out.println(jedi.getNombre()));
		
		//jedis.forEach(System.out::println);
		
		//Max
		List<Integer> numeros=Arrays.asList(4,5,656,232,54,657,865,23,433);
		
	//maximo
//		Integer x=0;
//		//numeros.for(numero->{if(x<numero){x=numero;});
//		for(int numero:numeros) {
//			if(x<numero) {
//				x=numero;
//			}
//		}
//		System.out.println("Max: "+x);
		
	//Maximo con lambda
		//int max=numeros.stream().max((a,b)->a-b).orElse(0);
		//int max=numeros.stream().max((a,b)->a.compareTo(b)).orElse(0);
		//System.out.println("Max: "+max);
		
	//jedi mas alto
		//Persona alto=jedis.stream().max((a,b)->a.getCentimetrosAltura()-b.getCentimetrosAltura()).orElse(null);
		//Persona alto=jedis.stream().max(Comparator.comparingInt(Persona::getCentimetrosAltura)).orElse(null);
		//System.out.println(alto);
		
	//sumatoria
//		int sumatorio=0;
//		for(int num:numeros) {
//			sumatorio+=num;
//		}
		
		//System.out.println(numeros.stream().mapToInt(n->n).sum());
		
	//suma de alturas
		//System.out.println(jedis.stream().mapToInt(jedi->jedi.getCentimetrosAltura()).sum());
		//System.out.println(jedis.stream().mapToInt(Persona::getCentimetrosAltura).sum());
		
	//Media
//		double media=0;
//		for(int nota:numeros) {
//			media+=nota;
//		}
//		media/=numeros.size();	
//		System.out.println("Media: "+media);
		
	//Media con lambda
		//System.out.format("Media %.2f",numeros.stream().mapToDouble(n->(double)n).average().orElse(0));
		
	//media de alturas jedi
		//System.out.println(jedis.stream().mapToDouble(Persona::getCentimetrosAltura).average().orElse(0));
		
		//filtrar elementos
		//numeros.stream().filter(n->n>100).forEach(System.out::println);
		
		//List<Integer> numerosMayores100=numeros.stream().filter(n->n>100).collect(Collectors.toList());
		//System.out.println(numerosMayores100);
		
	//Mostrar la lista de jedi que miden mas de un metro
		//jedis.stream().filter(jedi->jedi.getCentimetrosAltura()>100).forEach(System.out::println);
		
		//List<Persona> jedisAltos=jedis.stream().filter(jedi->jedi.getCentimetrosAltura()>100).collect(Collectors.toList());
		//System.out.println(jedisAltos);
		
	//Map
		//numeros.stream().map(n->n*2).forEach(System.out::println);
		//List<Integer> doblar=numeros.stream().map(n->n*2).collect(Collectors.toList());
	//lista de jedis a lista altura
		//List<Integer> alturas=jedis.stream().map(Persona::getCentimetrosAltura).collect(Collectors.toList());
		//System.out.println(alturas);
		
	//Reduce
	
	//sumatoria con reduce
		//int sumatoria=numeros.stream().reduce(0, (acumulado,valorActual)->acumulado+valorActual);
		//System.out.println(sumatoria);
	}

}
