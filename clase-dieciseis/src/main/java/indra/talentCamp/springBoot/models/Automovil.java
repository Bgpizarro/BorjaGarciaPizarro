package indra.talentCamp.springBoot.models;

import lombok.*;

@Getter @Setter
public class Automovil {

	private int id;
	private String marca;
	private String matricula;
	private boolean electrico;
	
	public void setMatricula(String matricula) {
		if(!matricula.matches("^[0-9]{4}[A-Z]{2}")){
			throw new Error("Validation Error : La matricula no tiene 4 numeros y 2 letras");
		}
		this.matricula=matricula;
	}
}
