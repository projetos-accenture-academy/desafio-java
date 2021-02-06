package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Usuario;

class LoginServiceTest {

	@Test
	void validarLogin() {
		Usuario usuario = new Usuario("admin", "");
		
		assertFalse(LoginService.validarDadosLogin(usuario));

		usuario.setLogin("admin123456admin12345600");
		assertFalse(LoginService.validarDadosLogin(usuario));
		
		usuario.setLogin(null);
		assertFalse(LoginService.validarDadosLogin(usuario));
		

		usuario.setSenha("123456");
		usuario.setLogin("admin");
		assertTrue(LoginService.validarDadosLogin(usuario));
		
	}

}
