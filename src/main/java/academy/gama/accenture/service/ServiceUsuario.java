package academy.gama.accenture.service;

import java.util.List;

import academy.gama.accenture.model.Usuario;
import academy.gama.accenture.model.interfaces.IUsuario;
import academy.gama.accenture.repository.RepositoryUsuario;

public class ServiceUsuario implements IUsuario {

	private RepositoryUsuario repositoryUsuario;

	public ServiceUsuario(RepositoryUsuario repositoryUsuario) {
		this.repositoryUsuario = repositoryUsuario;
	}

	public int add(Usuario user) {
		return get(user.getCpf()).getId();
	}

	public boolean update(Usuario user) {
		return repositoryUsuario.update(user);
	}

	public Usuario get(int id) {
		return repositoryUsuario.get(id);
	}

	public List<Usuario> getAll() {
		return repositoryUsuario.getAll();
	}

	public boolean remove(int id) {
		return repositoryUsuario.remove(id);
	}

	public Usuario get(String login) {
		return repositoryUsuario.get(login);
	}

}
