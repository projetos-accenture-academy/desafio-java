package test;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import academy.gama.accenture.model.Usuario;
import academy.gama.accenture.repository.RepositoryUsuario;

public class TestAddUsuario {

	private RepositoryUsuario repository = new RepositoryUsuario();

	@Test
	public void addUsuarioTest() {
		
		Usuario user = new Usuario("alecanutto", "123456", "Alessandra Camila", "000.000.000-00");			
		System.out.println(user.isValid());
		int id = repository.Add(user);
		assertTrue(id > 0);
		
	}

}
