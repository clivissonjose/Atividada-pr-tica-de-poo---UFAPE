package ap06.questao13;

public class Ciclista implements ICiclista{
	
	private String nome;
	private int idade;
	
	public Ciclista(String nome, int idade) {
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

		return this.idade;
	}

	@Override
	public void aquecer() {
		
		System.out.println("O ciclista " + this.nome + " está aquecendo");
		
	}

	@Override
	public void treinar() {
	
		System.out.println("O ciclista " + this.nome + " está treinado");
		
	}

	@Override
	public void pedalar() {
		
		System.out.println("O ciclista " + this.nome + " pedalando");
		
	}

}
