package interpreter;

public class Subtracao implements Expressao {

	private Expressao direita;
	private Expressao esquerda;
	
	public Subtracao(Expressao direita, Expressao esquerda) {
		this.direita = direita;
		this.esquerda = esquerda;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int avalia() {
		int valorDireita = direita.avalia();
		int valorEsquerda = esquerda.avalia();
		return valorDireita - valorEsquerda;
	}

}
