package memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

	public List<Estado> estados;
	
	public Historico() {
		estados = new ArrayList<Estado>();
	}
	
	public void adiciona(Estado estado) {
		estados.add(estado);
	}
	
	public Estado busca(int indice) {
		return estados.get(indice);
	}
}
