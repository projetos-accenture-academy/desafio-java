package model;

public class Usuario {
	private int id;
	private String nome;
	private String CPF;
	private String senha;
	private String login;
	
	public Usuario() {
		
	}
	
	public Usuario(String login, String senha) {
		this.senha = senha;
		this.login = login;
	}	
	
	public Usuario(String nome, String CPF, String senha, String login) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.senha = senha;
		this.login = login;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (!(obj instanceof Usuario))
			return false;
		
		Usuario other = (Usuario) obj;
		
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		
		return true;
	}
	
	
	

}
