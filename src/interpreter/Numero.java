package interpreter;

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

}
