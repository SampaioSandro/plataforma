package classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilmeTest {

	@Test
	public void validaNome() {

		Filme movie = new Filme("Onze homens e um segredo", 1.45, "16+");

		assertEquals("Onze homens e um segredo", movie.getNome());

	}

	@Test
	public void validaDuracao() {

		Filme movie = new Filme("À Espera de um Milagre", 2.59, "21+");

		assertEquals(2.59, movie.getDuracao());

	}

	@Test
	public void validaClassificacao() {

		Filme movie = new Filme("O Segredo", 2.33, "Livre");

		assertEquals("Livre", movie.getClassificacao());

	}

}
