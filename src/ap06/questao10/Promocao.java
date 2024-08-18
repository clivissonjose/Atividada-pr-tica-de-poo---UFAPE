package ap06.questao10;

public class Promocao implements ICategoria{

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Promocao";
	}

	@Override
	public double recalcularPreco() {
		// TODO Auto-generated method stub
		return -2;
	}


}
