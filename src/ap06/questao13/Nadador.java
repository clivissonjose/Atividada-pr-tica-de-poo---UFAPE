package ap06.questao13;

public class Nadador implements INadador {

	private String nome;
	private int idade;
	
	public Nadador(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return this.idade;
	}

	@Override
	public void aquecer() {
		System.out.println("O nadador  " + this.nome + " está aquecendo");
	}

	@Override
	public void treinar() {
		System.out.println("O nadador  " + this.nome + " está treinando");
	}

	@Override
	public void nadar() {
		System.out.println("O nadador  " + this.nome + " nadando");
	}
	
	
}
