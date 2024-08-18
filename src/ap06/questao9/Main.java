package ap06.questao9;

public class Main {

	public static void main(String[] args) {
		
		Infantil l1 = new Infantil("livro 1");
		Lancamento lanca1 = new Lancamento("Lancamento 1");
		Promocao promo = new Promocao("Promocao");
		
		l1.visualizarLivro();
		lanca1.visualizarLivro();
		promo.visualizarLivro();

	}

}
