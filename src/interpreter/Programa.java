package interpreter;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Expressao soma1 = new Soma(new Numero(10), new Numero(20));
		
		Expressao subtracao = new Subtracao(new Numero(20), new Numero(5));
		
		Expressao total = new Soma(soma1,subtracao);
		
		System.out.println(total.avalia());
	}

}
