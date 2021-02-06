package academy.gama.accenture.model.interfaces;

import java.util.List;

import academy.gama.accenture.model.Usuario;

public interface IUsuario {
	int Add(Usuario user);

	boolean Update(Usuario user);

	Usuario Get(int id);
	
	Usuario Get(String cpf);

	List<Usuario> GetAll();

	void Remove(int id);
}
