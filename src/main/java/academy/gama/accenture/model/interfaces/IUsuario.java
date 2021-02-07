package academy.gama.accenture.model.interfaces;

import java.util.List;

import academy.gama.accenture.model.Usuario;

public interface IUsuario {
	int add(Usuario user);

	boolean update(Usuario user);

	Usuario get(int id);
	
	Usuario get(String login);

	List<Usuario> getAll();

	boolean remove(int id);
}
