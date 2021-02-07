package academy.gama.accenture.model.interfaces;

public interface ILogin {

	boolean connect(String login, String senha);
	
	boolean disconnect(String login, String senha);
}
