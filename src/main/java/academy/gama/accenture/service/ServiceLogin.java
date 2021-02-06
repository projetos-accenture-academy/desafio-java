package academy.gama.accenture.service;

import academy.gama.accenture.dto.LoginDto;
import academy.gama.accenture.repository.RepositoryConta;
import academy.gama.accenture.repository.RepositoryUsuario;

public class ServiceLogin {

	RepositoryUsuario repositoryUsuario;
	RepositoryConta repositoryConta;

	public ServiceLogin() {
	  repositoryUsuario = new RepositoryUsuario();
	  repositoryConta = new RepositoryConta();
	}
	
	public boolean Logar(LoginDto loginDto) {
		return true; 
	}
	
}
