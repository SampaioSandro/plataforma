package classes;

import java.util.ArrayList;
import java.util.List;

public class RegistraMovie {

	public static void main(String[] args) {

		Plataforma plat = new Plataforma();
		plat.setSite("www.sky.com");
		plat.setNome("SKY");
		plat.setValor(77.0);
		plat.setQtdeAssinantes(333555777L);

		Filme movie_001 = new Filme("O Inferno de JAVA", 0.59, "18+");
		Filme movie_002 = new Filme("O Som do Trovão", 1.59, "16+");
		Filme movie_003 = new Filme("O Máscara", 1.33, "Livre");

		List<Filme> movie = new ArrayList<>();
		movie.add(movie_001);
		movie.add(movie_002);
		movie.add(movie_003);

		Categoria categoria = new Categoria();

		categoria.setCod_categoria("003");
		categoria.setNome("Comédia");

		for (Filme filme : movie) {
			System.out.println(plat.toString());
			System.out.println(filme.toString());
			System.out.println(categoria.toString());
		}
	}
}
