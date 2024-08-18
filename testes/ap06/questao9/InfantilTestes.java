package ap06.questao9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class InfantilTestes {

	@Test
	void testarPreco() {
		Infantil l1 = new Infantil("livro 1");
		assertEquals(6, l1.getPreco() );
	}

}
