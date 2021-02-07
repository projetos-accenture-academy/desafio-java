package academy.gama.accenture.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Base {
	
	private String login;
	private String senha;	
	private String nome;
	private String cpf;
	
	private final List<String> listError = new ArrayList<String>();
	
	public Usuario() {}
	
	public Usuario(String login, String senha, String nome, String cpf) {		
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}		
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
	public List<String> getListError() {
		return listError;
	}
		
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	public boolean isValid() {
		if (login.length() == 0) {
			listError.add("O login deve ser informado.");
			return false;
		}		
		if (login.length() > 20) {
			listError.add("O login deve conter no máximo 20 caracteres.");
			return false;
		}
		
		if (senha.isEmpty()) {
			listError.add("A senha deve ser informada.");
			return false;
		}		
		if (senha.length() < 6) {
			listError.add("A senha deve conter no mínimo 6 caracteres.");
			return false;
		}
		if (senha.length() > 8) {
			listError.add("A senha deve conter no máximo 8 caracteres.");
			return false;
		}	
		
		if (nome.isEmpty()) {
			listError.add("A senha deve ser informada.");
			return false;
		}		
	    if (nome.length() > 30) {
			listError.add("A senha deve conter no máximo 30 caracteres.");
			return false;
		}
	    
	    if (cpf.isEmpty()) {
			listError.add("O cpf deve ser informado.");
			return false;
		}	    
	    if (cpf.matches("(\\d{3})(\\d{3})(\\d{3})(\\d{2})")) {
			listError.add("O cpf informado é inválido.");
			return false;
		}		
		
		return true;
	}	

}
