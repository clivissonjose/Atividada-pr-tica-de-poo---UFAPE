package ap06.questao10;

public class MainTeste {

	public static void main(String[] args) {
		
		Filme filme1 = new Filme("Filme1");
		filme1.adicionarCategoria(new Infantil());
		filme1.adicionarCategoria(new Lancamento());
		filme1.adicionarCategoria(new Promocao());
		System.out.println(filme1);
		

	}

}
