package indra.talentCamp.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
public class App {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException{
		System.out.println("Bienvenidos a la clase de Reflection");

		try(Scanner in =new Scanner(System.in)){
			//indra.talentCamp.reflection.models.SuperHeroe
			
			
			//Busco una clase a partir del nombre con Reflection
			boolean claseEncontrada=false;
			Class<?> clazz =null;
			while(!claseEncontrada) {
				System.out.println("Ingrese el nombre completo de "
						+ "la clase para instanciar un objeto de la misma");
				String className=in.nextLine();
				try {
					 clazz=Class.forName(className);
					 claseEncontrada=true;
				} catch(Exception ex) {
					System.out.println("Clase no encontrada. Vuelva a intentar");
				}
			}
			
			//Listo los campos de una clase con reflection
			System.out.println("Los atributos de la clase son: ");
			Field[] fields= clazz.getDeclaredFields();
			for(Field field: fields) {
				System.out.format("  %s %s : %s",
						Modifier.toString(field.getModifiers()),
								field.getName(),
								field.getType().getName()
						);
				System.out.println("");
			}
			
			//Listo los metodos con reflection
			System.out.println("Los metodos son:");
			List<Method> metodos=Arrays.asList(clazz.getDeclaredMethods());
			metodos=metodos.stream().filter(m->!m.getName().startsWith("set") &&
					!m.getName().startsWith("get")).toList();
			for(Method method:metodos) {
				System.out.format("  %s %s : %s", 
						Modifier.toString(method.getModifiers()),
						method.getName(),
						method.getReturnType().getName());
				System.out.println();
			}
			
			//Para instanciar objetos sin el constructor con Reflection
			System.out.println("Instanciando un objeto de ese tipo");
			Object objeto= clazz.getConstructors()[0].newInstance();
			System.out.println("Objetos instanciados");
			
			//modificamos un atributo con reflection y rompemos el encapsulamiento
			System.out.println("Desea usted modificar algun atributo?");
			String modificarAtributo =in.nextLine();
			while(modificarAtributo.equalsIgnoreCase("S")) {
				
				boolean encontrado=false;
				while(!encontrado) {
					
					System.out.println("Que atributo desea modificar?");
					String atributo=in.nextLine();
					
					try {
						Field f=clazz.getDeclaredField(atributo);
						System.out.println("Introduzca el nuevo valor");
						String valor=in.nextLine();
						f.setAccessible(true);
						f.set(objeto, valor);
						encontrado=true;
					}catch(Exception ex) {
						System.out.println("Atributo no encontrado"+ex.getMessage());
					}
				}
				System.out.println("Desea modificar otro atributo?");
				modificarAtributo=in.nextLine();
			}
			
			//Lista los atributos con sus valores con Reflection
			System.out.println("Los atributos se quedan asi:");
			for(Field field:fields) {
				field.setAccessible(true);
				System.out.format(" %s : %s",
						field.getName(),
						field.get(objeto));
				System.out.println();
			}
			
			System.out.println("Desea invocar un metodo?");
			String modificarMetodo=in.nextLine();
			while(modificarMetodo.equalsIgnoreCase("S")) {
				boolean encontrado=false;
				while(!encontrado) {
					System.out.println("Que metodo? (ojo sin parametros)");
					String nombreMetodo=in.nextLine();
					try {
						Method metodo= clazz.getDeclaredMethod(nombreMetodo);
						metodo.invoke(objeto);
						encontrado=true;
					} catch(Exception ex) {
						System.out.println("Metodo no encontrado, vuelva a intentarlo");
					}
				}
				
				System.out.println("Desea invocar otro metodo?");
				modificarMetodo=in.nextLine();
			}
		}
	}

}
