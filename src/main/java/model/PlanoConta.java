package model;

public class PlanoConta {

	private int id;
	private String descricao;
	private char tipoMovimento;
	private Usuario usuario;
	
	public PlanoConta(int id, String descricao, char tipo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tipoMovimento = tipo;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public char getTipo() {
		return tipoMovimento;
	}

	public void setTipo(char tipo) {
		this.tipoMovimento = tipo;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
