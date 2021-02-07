package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import academy.gama.accenture.model.Usuario;
import academy.gama.accenture.repository.RepositoryLogin;
import academy.gama.accenture.repository.RepositoryUsuario;

public class TestLogin {

	private RepositoryUsuario repository = new RepositoryUsuario();
	private RepositoryLogin repositoryLogin = new RepositoryLogin(repository); 

	@Test
	public void loginInexistente() {
		Usuario user = new Usuario("alecanutto", "123456", "Alessandra Camila", "000.000.000-00");
		int id = repository.add(user);
		assertTrue(id > 0);
		assertNull("Login encontrado.", repository.get("alecanutto"));
	}
	
	@Test
	public void senhaInvalida() {
		Usuario user = new Usuario("alecanutto", "123456", "Alessandra Camila", "000.000.000-00");
		int id = repository.add(user);
		assertTrue(id > 0);
		assertEquals("Senha inválida.", "132456", repository.get(id).getSenha());
	}
	
	@Test
	public void login() {
		Usuario user = new Usuario("alecanutto", "123456", "Alessandra Camila", "000.000.000-00");
		int id = repository.add(user);
		assertTrue(id > 0);
		assertTrue(repositoryLogin.connect(user.getLogin(), user.getSenha()));
	}
	
}