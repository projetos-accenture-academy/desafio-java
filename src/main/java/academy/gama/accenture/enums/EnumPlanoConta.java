package academy.gama.accenture.enums;

public enum EnumPlanoConta {
	CREDITO(1), DEBITO(2);
	
	private int tipo;
	
	EnumPlanoConta(int tipo) {
		this.tipo = tipo;
	}

	public int getTipoPlanoConta() {
		return tipo;
	}
	
	
	
	
}
