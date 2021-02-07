package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import academy.gama.accenture.model.Usuario;
import academy.gama.accenture.repository.RepositoryUsuario;

public class TestUsuario {

	private RepositoryUsuario repository = new RepositoryUsuario();

	@Test
	public void usuarioJaCadastrado() {
		Usuario user = new Usuario("alecanutto", "123456", "Alessandra Camila", "000.000.000-00");
		int id = repository.add(user);	
		assertTrue(id > 0);
		boolean result = repository.exists(user);
		assertTrue(result);
	}

	@Test
	public void addUsuario() {
		Usuario user = new Usuario("alecanutto", "123456", "Alessandra Camila", "000.000.000-00");
		int id = repository.add(user);
		assertTrue(id > 0);
	}
	
	@Test
	public void addUsuarioInvalido() {
		Usuario user = new Usuario("", "123456", "Alessandra Camila", "000.000.000-00");
		int id = repository.add(user);	
		assertTrue(id == 0);
	}
	
	@Test
	public void addUsuarioNull() {
		Usuario user = null;	
		assertNull(user);
	}
	
	@Test
	public void getUsuario() {
		Usuario user = new Usuario("alecanutto", "123456", "Alessandra Camila", "000.000.000-00");
		int id = repository.add(user);
		assertTrue(id > 0);
		assertNotNull("Erro ao recuperar usuário.", repository.get(id));
	}

}
