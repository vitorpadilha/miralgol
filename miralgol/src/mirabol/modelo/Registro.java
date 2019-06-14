package mirabol.modelo;

import java.util.Map;

public class Registro extends TipoDeDados{

	public Registro(Map<String,TipoDeDados> campos) {
		super('O');
		this.campos = campos;
		// TODO Auto-generated constructor stub
	}

	private Map<String,TipoDeDados> campos;
}
