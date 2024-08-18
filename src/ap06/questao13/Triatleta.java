package ap06.questao13;

public class Triatleta implements INadador, ICiclista, ICorredor {
	
	private  String nome;
	private int idade;
	
	

	public Triatleta(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public void aquecer() {
		
		System.out.println("O triatleta " + this.nome + " está aquecendo");
		
	}

	@Override
	public void treinar() {
		
		System.out.println("O triatleta " + this.nome + " está treinando");
		
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
	public void correr() {
		
		System.out.println("O tritleta  " + this.nome + " está correndo");
		
	}

	@Override
	public void pedalar() {
		
		System.out.println("O triatleta " + this.nome + " está pedalando");
		
	}

	@Override
	public void nadar() {
		
		System.out.println("O triatleta " + this.nome + " está nadando");
		
	}

}
