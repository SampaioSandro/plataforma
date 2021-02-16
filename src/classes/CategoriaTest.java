package classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoriaTest {

	@Test
	public void validaCodCategoria() {

		Categoria categoria = new Categoria();

		categoria.setCod_categoria("001");
		categoria.setNome("Ação");

		categoria.getCod_categoria();

		assertEquals("001", categoria.getCod_categoria());

	}

	@Test
	public void validaNomeCategoria() {

		Categoria categoria = new Categoria();

		categoria.setNome("Ação");

		categoria.getStringNome();

		assertEquals("Ação", categoria.getStringNome());

	}

}
