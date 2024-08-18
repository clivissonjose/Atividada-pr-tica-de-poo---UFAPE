package ap06.questao9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PromocaoTestes {

	@Test
	void testPreco() {
		Promocao promo = new Promocao("Promo");
		assertEquals(2, promo.getPreco());
	}

}
