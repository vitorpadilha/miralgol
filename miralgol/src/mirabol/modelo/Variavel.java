package mirabol.modelo;

public class Variavel {

		private TipoDeDados tipo;
		private Instrucao valorInicial;
		private String nome;
		public TipoDeDados getTipo() {
			return tipo;
		}
		public void setTipo(TipoDeDados tipo) {
			this.tipo = tipo;
		}
		public Instrucao getValorInicial() {
			return valorInicial;
		}
		public void setValorInicial(Instrucao valorInicial) {
			this.valorInicial = valorInicial;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
}