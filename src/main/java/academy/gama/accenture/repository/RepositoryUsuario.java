package academy.gama.accenture.repository;

import java.util.ArrayList;
import java.util.List;

import academy.gama.accenture.model.Usuario;
import academy.gama.accenture.model.interfaces.IUsuario;

public class RepositoryUsuario implements IUsuario {

	private List<Usuario> listUsuario = new ArrayList<Usuario>();

	public int add(Usuario user) {
		if (!exists(user) && user.isValid()) {
			user.setId(listUsuario.size() + 1);
			listUsuario.add(user);
			return user.getId();
		}
		return 0;
	}

	public boolean update(Usuario user) {
		if (!user.isValid()) {
			return false;
		}
		int index = listUsuario.indexOf(user);
		if (index != -1) {
			listUsuario.set(index, user);
			return true;
		}
		return false;
	}

	public Usuario get(int id) {
		return listUsuario.stream().filter(u -> u.getId() == id).findAny().orElse(null);
	}

	public Usuario get(String login) {
		return listUsuario.stream().filter(u -> u.getLogin().equals(login)).findAny().orElse(null);
	}

	public List<Usuario> getAll() {
		return listUsuario;
	}

	public boolean remove(int id) {
		return listUsuario.remove(get(id));
	}

	public boolean exists(Usuario user) {
		return listUsuario.stream().filter(u -> u.getId() == user.getId() ||
			u.getLogin().equals(user.getLogin())).findAny().isPresent();
	}

}
