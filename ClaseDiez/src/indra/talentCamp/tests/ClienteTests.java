package indra.talentCamp.tests;

import indra.talentCamp.ejercicioBanco.Cliente;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;



public class ClienteTests {

	@Test
	public void ShouldValidateClienteCreation() {
		assertThrows(AssertionError.class,()->Cliente.builder().setNombre("mal").build());
		assertThrows(AssertionError.class,()->Cliente.builder().setApellido("mal").build());
		assertThrows(AssertionError.class,()->Cliente.builder().setIdentificador(1).build());
		assertThrows(AssertionError.class,()->Cliente.builder().setNombre("mal").setApellido("mal").build());
		Cliente.builder().setNombre("mal").build();
	}
}
