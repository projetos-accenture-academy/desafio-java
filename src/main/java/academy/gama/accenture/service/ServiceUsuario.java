package academy.gama.accenture.service;

import java.util.List;

import academy.gama.accenture.model.Usuario;
import academy.gama.accenture.model.interfaces.IUsuario;
import academy.gama.accenture.repository.RepositoryUsuario;

public class ServiceUsuario implements IUsuario {

	private RepositoryUsuario repositoryUsuario;
	
	public ServiceUsuario(RepositoryUsuario repositoryUsuario) {
		super();
		this.repositoryUsuario = repositoryUsuario;
	}

	public int Add(Usuario user) {
		return Get(user.getCpf()).getId();
	}

	public boolean Update(Usuario user) {
		return repositoryUsuario.Update(user);
	}

	public Usuario Get(int id) {
		return repositoryUsuario.Get(id);
	}

	public List<Usuario> GetAll() {
		return repositoryUsuario.GetAll();
	}

	public void Remove(int id) {
		repositoryUsuario.Remove(id);
	}

	public Usuario Get(String cpf) {
		return repositoryUsuario.Get(cpf);
	}		
	
}
