package interpreter;

import visitor.Visitor;

public class Numero implements Expressao {

	private int valor;
	
	public Numero(int valor) {
		this.valor = valor;
	}
	@Override
	public int avalia() {
		// TODO Auto-generated method stub
		return valor;
	}
	public int getNumero() {
		// TODO Auto-generated method stub
		return valor;
	}
	
	 @Override
	    public void aceita(Visitor visitor) {
	        visitor.visitaNumero(this);
	    }
}
