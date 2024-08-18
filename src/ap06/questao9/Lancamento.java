package ap06.questao9;

public class Lancamento extends Filmes {

	private double aumento = 3;
	public Lancamento(String titulo) {
		super(titulo);
		this.setPreco(getPreco()+ aumento);
		this.setCategoria("Lançamento");
	}
	
	@Override
	public void visualizarLivro() {
		System.out.println("Titulo: " + this.getTitulo() + "\nPreço: "+ this.getPreco() + "\nCategoria: "
				+ this.getCategoria());
	}


}
