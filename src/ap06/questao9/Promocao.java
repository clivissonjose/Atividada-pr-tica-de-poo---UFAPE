package ap06.questao9;

public class Promocao extends Filmes{

	private double desconto = 2;
	public Promocao(String titulo) {
		super(titulo);
		this.setPreco(getPreco()- desconto);
		this.setCategoria("Promocao");
	}

	
	// Utilizando Polimorfismo
	@Override
	public void visualizarLivro() {
		System.out.println("Titulo: " + this.getTitulo() + "\nPreço: "+ this.getPreco() 
		+ "\nCategoria: " + this.getCategoria());
	}

}
