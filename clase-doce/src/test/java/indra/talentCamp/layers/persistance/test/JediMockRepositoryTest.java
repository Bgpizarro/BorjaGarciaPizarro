package indra.talentCamp.layers.persistance.test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import indra.talentCamp.layers.persistance.NotFoundException;
import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistance.JediMockRepository;

class JediMockRepositoryTest {

	@Test
	void shouldThrowAnExceptionIfNotFound() {
		JediMockRepository repo=new JediMockRepository();
		assertThrows(NotFoundException.class,()->repo.findById(28));
	}

	@Test
	void shouldSaveAndThenFind() throws NotFoundException{
		JediMockRepository repo= new JediMockRepository();
		Jedi yoda= new Jedi("Yoda", 100000, Color.GREEN);
		repo.save(yoda);
		Jedi jodaRenacido=repo.findById(1);
		assertEquals(yoda.getNombre(),jodaRenacido.getNombre());
	}
}
