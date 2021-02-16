package classes;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {

	private String nome;
	private String site;
	private boolean ativo = true;
	private double valor;
	private Long qtdeAssinantes;
	private List<Filme> movies = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Long getQtdeAssinantes() {
		return qtdeAssinantes;
	}

	public void setQtdeAssinantes(Long qtdeAssinantes) {
		this.qtdeAssinantes = qtdeAssinantes;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<Filme> getMovies() {
		return movies;
	}

	public void setMovies(List<Filme> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Nome da Plataforma: " + nome + ", Site: " + site + " Valor: " + valor + " Qtde de Assinantes: "
				+ qtdeAssinantes + "\r\n";
	}

}
