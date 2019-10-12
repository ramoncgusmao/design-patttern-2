package interpreter;

import visitor.Visitor;

public class Subtracao implements Expressao {

	private Expressao direita;
	private Expressao esquerda;
	
	public Subtracao(Expressao esquerda, Expressao direita) {
		this.direita = direita;
		this.esquerda = esquerda;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int avalia() {
		int valorDireita = direita.avalia();
		int valorEsquerda = esquerda.avalia();
		return  valorEsquerda - valorDireita;
	}
	
	 @Override
	    public void aceita(Visitor visitor) {
	        visitor.visitaSubtracao(this);
	    }

	 public Expressao getDireita() {
		return direita;
	}
	public Expressao getEsquerda() {
		return esquerda;
	}
}
