package academy.gama.accenture.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JUnitLoginTest {
	
	@Test
	@DisplayName("Test Usuario.setLogin()")
	void testAddUsuario(Usuario user) {
		assertEquals("alessandra", user.getLogin());
	}

}
