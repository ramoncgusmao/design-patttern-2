package interpreter;

import visitor.Visitor;

public interface Expressao {
	
	public int avalia();

	public void aceita(Visitor visitor);
}
