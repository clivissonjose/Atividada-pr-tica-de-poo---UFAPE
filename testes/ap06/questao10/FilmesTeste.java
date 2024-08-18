package ap06.questao10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilmesTeste {
	
	double lancamento;
	double infantil;
	double promocao;
	double precoLivroTodasCategorias;
	
	@BeforeEach
	void valoresDasrVariaveis() {
	    lancamento = 7;
	    infantil = 6;
	    promocao = 2;
		precoLivroTodasCategorias = 7;
	}

	@Test
	void testaValoresDoFilme() {
		
		Filme filme1 = new Filme("Filme 1");
		filme1.adicionarCategoria(new Infantil());
		filme1.adicionarCategoria(new Lancamento());
		filme1.adicionarCategoria(new Promocao());
		// 4( qualquer filme ) + 2 ( Infantil ) + 3 (promocao) - 2 ( lancamento )
		double valorEsperado = 7;
		assertEquals(valorEsperado, filme1.getPreco());
	}
	
	@Test
     void testaValoresDoFilmeLancameto() {
		Filme filme2 = new Filme("Filme 2");
		filme2.adicionarCategoria(new Lancamento());
		assertEquals(lancamento, filme2.getPreco());
		
	}

	@Test
	void testarValoresPromocao() {
		Filme filme3 = new Filme("Filme 3");
		filme3.adicionarCategoria(new Promocao());
		assertEquals(promocao, filme3.getPreco());
	}
	
	@Test
	void testarValoresInfantil() {
		Filme filme4 = new Filme("Filme 4");
		filme4.adicionarCategoria(new Infantil());
		assertEquals(infantil, filme4.getPreco());
	}
}
