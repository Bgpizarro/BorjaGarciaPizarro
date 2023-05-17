package indra.talentCamp.generics;

@FunctionalInterface
public interface Operacion<T> {
	//Si o si, un solo metodo
	T operar(T a,T b);
}
