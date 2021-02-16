package classes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PlataformaTest {

	@Test
	public void testaNome() {

		Plataforma plat = new Plataforma();

		plat.setNome("Netflix");

		assertEquals("Netflix", plat.getNome());

	}

	@Test
	public void testaSite() {

		Plataforma plat = new Plataforma();

		plat.setSite("www.netflix.com");

		assertEquals("www.netflix.com", plat.getSite());

	}

	@Test
	public void testaValor() {

		Plataforma plat = new Plataforma();

		plat.setValor(37.9);

		assertEquals(37.9, plat.getValor());

	}

	@Test
	public void testaAssinantes() {

		Plataforma plat = new Plataforma();

		plat.setQtdeAssinantes(333L);

		assertEquals(333L, plat.getQtdeAssinantes());

	}

	@Test
	public void testaAtivo() {

		Plataforma plat = new Plataforma();

		plat.setAtivo(false);

		assertFalse(plat.isAtivo());

	}

}
