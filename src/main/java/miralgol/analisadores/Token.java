package miralgol.analisadores;

public class Token {
	private String token;
	private Integer linha;
	private Token proximoToken;
	private int teste22;
	public Token(String token, Integer linha) {
		// TODO Auto-generated constructor stub
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Integer getLinha() {
		return linha;
	}
	public void setLinha(Integer linha) {
		this.linha = linha;
	}
	public Token getProximoToken() {
		return proximoToken;
	}
	public void setProximoToken(Token proximoToken) {
		this.proximoToken = proximoToken;
	}
}
