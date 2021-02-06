package academy.gama.accenture.model.interfaces;

public interface ILogin {

	boolean Connect(String login, String senha);
	
	boolean Disconnect(String login, String senha);
}
