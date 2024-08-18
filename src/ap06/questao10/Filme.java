package ap06.questao10;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	
	private String titulo;
	private double  preco;
	private List<ICategoria> categorias;
	
	/* 
	 A forma na qual eu pensei em misturar as categorias foi cria uma interface Categoria, para pegar
	 o nome da categoria e o preco do livro. Atraves de uma composição as classes Infantil, lancamento
	 e promocao calculam o  preço do livro dinamicamente. Nesse caso poderá ser criado um filme e adicionar
	 sua categoria.
	 
	 Usar herança nessa caso não seria uma boa alternativa pois teria que ser criadas outras classes
	 como FilmeInfantilLancamento, FilmePromocaoInfantil, etc. o que seria difícil de gerenciar.
	 */

	public Filme(String titulo) {
		super();
		this.titulo = titulo;
		this.preco = 4;	
		this.categorias = new ArrayList<>();
	}
	
	public void adicionarCategoria(ICategoria categoria) {
		categorias.add(categoria);
		// preco precisa ser atualizado
		atualizarPreco(categoria);
	}
	
	
	// Após ser adicionado uma nova categoria o preco precisa ser alterado
	
	private void atualizarPreco(ICategoria categoria) {
		this.preco+= categoria.recalcularPreco();
	}
	
	// Como a questão não pede, não criei um método caso seja retirada uma categoria 
	// por exemplo um livro infantil deixasse de ser lancamento.
	
	@Override
	public String toString() {
		
		String categoriaDoLivro = " ";
		
		for(ICategoria c : categorias) {
			categoriaDoLivro += " " + c.getNome();
		}
		return "Titulo=" + titulo + ", preco = " + 
		preco + ", categorias = " + categoriaDoLivro.trim();  
	}


	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}