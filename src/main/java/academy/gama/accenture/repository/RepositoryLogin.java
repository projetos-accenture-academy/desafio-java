package academy.gama.accenture.repository;

import academy.gama.accenture.model.interfaces.ILogin;

public class RepositoryLogin implements ILogin {

	RepositoryUsuario repository;
	
	private boolean isConnected;
	
	public RepositoryLogin(RepositoryUsuario repository) {
		this.repository = repository;
	}

	@Override
	public boolean connect(String login, String senha) {
		isConnected = repository.getAll().stream().filter(u -> u.getLogin().equals(login) && 
				u.getSenha().equals(senha)).findAny().isPresent();
		return isConnected;
	}

	@Override
	public boolean disconnect(String login, String senha) {
		return !isConnected;
	}

}
