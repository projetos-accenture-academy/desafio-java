package service;

import model.Usuario;

public class LoginService {

	public static boolean validarDadosLogin(Usuario usuario) {
		if(usuario.getLogin() == null)
			return false;
		
		if(usuario.getLogin().length() >= 20 || 
			usuario.getLogin().length() == 0 || 
			usuario.getSenha().length() == 0)
			return false;
		
		return true;
	}
}
