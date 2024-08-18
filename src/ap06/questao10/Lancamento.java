package ap06.questao10;

public class Lancamento implements ICategoria {

	@Override
	public String getNome() {
		return "Lancamento";
	}
	@Override
	public double recalcularPreco() {
		return 3;
	}
}
