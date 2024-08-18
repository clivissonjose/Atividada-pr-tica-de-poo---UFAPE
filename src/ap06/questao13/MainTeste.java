package ap06.questao13;

public class MainTeste {

	public static void main(String[] args) {
		
		Nadador nadador1 = new Nadador("Carlos", 34);
		Ciclista ciclista1 = new Ciclista("Vanessa", 14);
		Corredor corredor1 = new Corredor("Kaic", 67);
		Triatleta tri1 = new Triatleta("Caio", 20);
		
		
		System.out.println("=====   Nadador =====");
		
		nadador1.aquecer();
		nadador1.treinar();
		nadador1.nadar();

		System.out.println("=====   Ciclista =====");
		
		ciclista1.aquecer();
		ciclista1.treinar();
		ciclista1.pedalar();
		
		System.out.println("=====  Corredor =====");
		
		corredor1.aquecer();
		corredor1.treinar();
		corredor1.correr();
		
		System.out.println("=====  Triatleta =====");
		
		tri1.aquecer();
		tri1.treinar();
		tri1.correr();
		tri1.pedalar();
		tri1.nadar();
	}

}
