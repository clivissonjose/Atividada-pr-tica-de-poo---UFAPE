package ap06.questao13;

public class Corredor implements ICorredor {

	private String nome;
	private int idade;
	
	public Corredor(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String getNome() {
	
		return this.nome;
	}

	@Override
	public int getIdade() {
	
		return this.idade;
	}

	@Override
	public void aquecer() {
		System.out.println("O corredor  " + this.nome + " está aquecendo");
	}

	@Override
	public void treinar() {
		System.out.println("O corredor " + this.nome + " está treinando");
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("O corredor  " + this.nome + " está correndo");
		
	}

}
