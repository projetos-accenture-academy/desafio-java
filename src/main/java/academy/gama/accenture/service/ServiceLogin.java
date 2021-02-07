package academy.gama.accenture.service;

import academy.gama.accenture.model.interfaces.ILogin;
import academy.gama.accenture.repository.RepositoryLogin;

public class ServiceLogin implements ILogin {

	RepositoryLogin repositoryLogin;

	public ServiceLogin(RepositoryLogin repositoryLogin) {
	  this.repositoryLogin = repositoryLogin;
	}
	
	@Override
	public boolean connect(String login, String senha) {
		return repositoryLogin.connect(login, senha);
	}

	@Override
	public boolean disconnect(String login, String senha) {
		return repositoryLogin.disconnect(login, senha);
	}
	
}
