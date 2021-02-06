package academy.gama.accenture.repository;

import java.util.List;

import academy.gama.accenture.model.Usuario;
import academy.gama.accenture.model.interfaces.IUsuario;

public class RepositoryUsuario implements IUsuario {

	public int Add(Usuario user) {
		if (user.isValid()) {
			return 1;
		}
		return 0;
	}

	public boolean Update(Usuario user) {
		// TODO Auto-generated method stub
		return false;
	}

	public Usuario Get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Usuario Get(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuario> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void Remove(int id) {
		// TODO Auto-generated method stub
		
	}

		

}
