package ap06.questao9;

public class Infantil extends Filmes{

	private double aumento = 2;
	
	public Infantil(String titulo) {
		super(titulo);
		this.setPreco(getPreco() + aumento);
		this.setCategoria("Infantil");
	}
	
	// Utilizando o polimorfismo
	@Override
	public void visualizarLivro() {
		System.out.println("Titulo: " + this.getTitulo() + "\nPreço: "+ this.getPreco() + "\nCategoria: "
				+ this.getCategoria());
	}


}
