package ap06.questao9;

public class Filmes {
	
	private String titulo;
	private double  preco;
	private String categoria;

	public Filmes(String titulo) {
		super();
		this.titulo = titulo;
		this.preco= 4;	
	}
	
	public void visualizarLivro() {
		System.out.println("Titulo " + this.titulo + " preço "+ this.preco);
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
