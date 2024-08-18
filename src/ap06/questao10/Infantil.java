package ap06.questao10;

public class Infantil implements ICategoria  {
	
	@Override
	public String getNome() {
		return "Infantil";
	}
	@Override
	public double recalcularPreco() {
		return 2;
	}


}
