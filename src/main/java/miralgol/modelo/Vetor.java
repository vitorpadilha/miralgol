package miralgol.modelo;

import java.util.List;

public class Vetor extends TipoDeDados{

	private TipoDeDados tipoDoVetor;
	private int dimensoes;
	private List<Integer> tamanhosDasDimensoes;
	public Vetor(TipoDeDados tipoDoVetor, int dimensoes,List<Integer> tamanhosDasDimensoes) {
		super('V');
		this.tipoDoVetor = tipoDoVetor;
		this.dimensoes = dimensoes;
		this.tamanhosDasDimensoes = tamanhosDasDimensoes;
		// TODO Auto-generated constructor stub
	}
}
