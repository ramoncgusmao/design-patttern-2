package visitor;

import interpreter.Numero;
import interpreter.Soma;
import interpreter.Subtracao;

public class ImpressoraVisitor implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {
		
		System.out.print("(");
		soma.getEsquerda().aceita(this);
		System.out.print(" + ");
		soma.getDireita().aceita(this);
		System.out.print(" ) ");

	}
	
	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		
		System.out.print("(");
		subtracao.getEsquerda().aceita(this);
		System.out.print(" - ");
		subtracao.getDireita().aceita(this);
		System.out.print(" ) ");

	}
	
	@Override
	public void visitaNumero(Numero numero) {
		
		
		System.out.print(numero.getNumero());
	

	}
}
