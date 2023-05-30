package indra.talentCamp.springBoot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegistrarAutomovilResult {

	private boolean operacionExitosa;
	private String mensaje;
}
