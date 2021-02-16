package classes;

public class Categoria {

	private String nome;
	private String cod_categoria;

	public String getStringNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCod_categoria() {
		return cod_categoria;
	}

	public void setCod_categoria(String cod_categoria) {
		this.cod_categoria = cod_categoria;
	}

	@Override
	public String toString() {
		return "Código da Categoria: " + cod_categoria + ", Nome da Categoria: " + nome + "\r\n";
	}
}
