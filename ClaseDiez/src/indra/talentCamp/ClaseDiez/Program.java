package indra.talentCamp.ClaseDiez;

import java.time.*;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Manejo de fechas
		LocalDate fecha =LocalDate.now();
		System.out.println(fecha);
		//System.out.println(ZoneId.from(fecha));
		
		LocalDateTime fechaYHora=LocalDateTime.now();
		System.out.println(fechaYHora);
		
		LocalTime horaActual=LocalTime.now();
		System.out.println(horaActual);
		
		LocalDate fechaEspecifica = LocalDate.of(2023, Month.FEBRUARY, 10);
		LocalDate cumpleBorja =  LocalDate.of(2023,Month.DECEMBER,24);
		System.out.format("Feliz cumple Borja el %d del mes %s",
				cumpleBorja.getDayOfMonth(),
				cumpleBorja.getMonthValue());
		System.out.println();
		
		LocalDate navidad=cumpleBorja.plusDays(1);
		System.out.println("Feliz Navidad");
		System.out.println(navidad);
		
		if(cumpleBorja.isBefore(navidad)) {
			System.out.println("Borja cumple antes de la navidad");
		}
		
		Period periodo= Period.between(cumpleBorja, navidad);
		System.out.format("Hay %d años, %d meses, %d dias entre el cumple de Borja y la navidad",
				periodo.getYears(),periodo.getMonths(),periodo.getDays());
		System.out.println();
		
		Duration duracion= Duration.between(LocalTime.now(), horaActual);
		System.out.println(duracion.getSeconds());
		
		
		//Manejo de strings
		String texto="Hola que tal como estan todos";
		List<String> palabras= Arrays.asList(texto.split(" "));
		palabras.forEach(System.out::println);
		
		texto=texto + "  adada ".trim();	
		
		//Diccionarios
		Map<String,String> diccionario =new HashMap<>();
		diccionario.put("Casa", "Donde vive la gente");
		if(!diccionario.containsKey("auto")) {
			diccionario.put("auto", "Vehiculo motorizado para transporte");
		}
		
		for(var entrada: diccionario.entrySet()) {
			System.out.println(entrada.getKey()+" : "+entrada.getValue());
		}
		
		String texto2="casa de la casa no amasa la casa";
		Map<String,Integer> dicc=new HashMap<>();
		List<String> palabras2= Arrays.asList(texto2.split(" "));
		for(String x:palabras2) {
			int key=0;
			for(String c:palabras2) {
				if(x.equals(c))key++;
			}
			dicc.put(x, key);
			key=0;
		}
		for(var entrada: dicc.entrySet()) {
			System.out.println(entrada.getKey()+" : "+entrada.getValue());
		}
		
		//ejemplo de set
		Set<String> conjunto=new HashSet<>();
		conjunto.add("Casa");
		conjunto.add("Casa");
		conjunto.add("Casa");
		conjunto.add("Mesa");
		conjunto.add("Mesa");
		conjunto.add("Casa");
		
		System.out.println(conjunto.size());
		for(var e:conjunto) {
			System.out.println(e);
		}
		
		//Priority queue
		Queue<Integer> prioridades=new PriorityQueue<>();
		prioridades.offer(9);
		prioridades.offer(19);
		prioridades.offer(49);
		prioridades.offer(1);
		prioridades.offer(2);
		prioridades.offer(194);
		System.out.println(prioridades.poll());
		
		
	}

}
