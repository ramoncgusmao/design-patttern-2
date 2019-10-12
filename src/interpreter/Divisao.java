package interpreter;

import visitor.Visitor;

public class Divisao implements Expressao {

	private Expressao direita;
	private Expressao esquerda;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.direita = direita;
		this.esquerda = esquerda;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int avalia() {
		int valorDireita = direita.avalia();
		int valorEsquerda = esquerda.avalia();
		return  valorEsquerda / valorDireita;
	}

	@Override
	public void aceita(Visitor visitor) {

	}

	public Expressao getDireita() {
		return direita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}
}
