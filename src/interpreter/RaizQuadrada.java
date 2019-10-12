package interpreter;

import visitor.Visitor;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;
	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int avalia() {
		int resultado = expressao.avalia();
		return (int) Math.sqrt(resultado);
	}

	 @Override
	    public void aceita(Visitor visitor) {
	    
	    }
	 public Expressao getExpressao() {
		return expressao;
	}

}
