package ap06.questao9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LancamentoTestes {

	@Test
	void testPreco() {
		Lancamento l1 = new Lancamento("Testes");
		assertEquals(7, l1.getPreco());
	}

}
