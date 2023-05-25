package indra.talentCamp.dependencyInjection.field.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import indra.talentCamp.dependencyInjection.field.*;

public class PartyServiceTest {

	PartyService service;
	
	@Before
	public void configure() {
		service=new PartyService();
		service.setRepository(new MockRepository());
	}
	
	@Test
	public void test() {
		service.haveFun();
		assertEquals(true,true);
	}
}
