package miralgol.modelo;

public class TipoDeDados {
	public static TipoDeDados INTEIRO = new TipoDeDados('I');
	public static TipoDeDados REAL = new TipoDeDados('R');
	public static TipoDeDados CARACTERE = new TipoDeDados('C');
	public static TipoDeDados LOGICO = new TipoDeDados('L');
	private char tipo;
	
	
	public TipoDeDados(char tipo) {
		this.tipo = tipo;
	}
}
