package classes;

public class Filme {

	private String nome;
	private double duracao;
	private String classificacao;

	public Filme(String nome, double duracao, String classificacao) {
		this.nome = nome;
		this.duracao = duracao;
		this.classificacao = classificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Duração: " + duracao + " Classificação: " + classificacao + "\r\n";
	}
}
