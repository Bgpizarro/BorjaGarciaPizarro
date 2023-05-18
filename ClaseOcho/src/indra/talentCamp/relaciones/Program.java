package indra.talentCamp.relaciones;

import indra.talentCamp.relaciones.composite.*;

import org.mozilla.javascript.*;

public class Program {

	public static void main(String[] args) {
		
		//vamos a realizar el siguiente calculo
		//2+2*3
		
//		Operacion calculo= new Suma(
//				new Valor(2),
//				new Multiplicacion(new Valor(2), new Valor(3)));
		
		Operacion calculo= new Suma(2.0, new Multiplicacion(2.0,3.0));
		
		System.out.println("2+2*3= "+calculo.calcular());
		
		//6*5+3*8
		
//		Operacion calculo2= new Suma(
//				new Multiplicacion( new Valor(6),new Valor(5)),
//						new Multiplicacion(new Valor(3), new Valor(8))
//				);
		Operacion calculo2= new Suma(new Multiplicacion(6,5),new Multiplicacion(3,8));
		
		System.out.println("6*5+3*8= "+calculo2.calcular());
		
		//5+3*8+4*3
		Operacion calculo3=new Suma(5,new Suma(new Multiplicacion(3,8),new Multiplicacion(4,3)));
		
		System.out.println("5+3*8+4*3= "+ calculo3.calcular());
		
		String expresion="5+3*8+4*3";
		
		//ScriptEngineManager manager= new ScriptEngineManager();
		//ScriptEngine engine=manager;
		Context jsContext=Context.enter();
		
		try {
			var res=jsContext.evaluateString(jsContext.initSafeStandardObjects(),
					expresion,
					"Calculo",
					1,
					null);
			System.out.println("el resultado es: ");
			System.out.println(expresion+" = "+res);
		}finally {
			Context.exit();
		}
	}

}
