package memento;

public class Estado {

	private Contrato contrato;
	
	public Estado(Contrato contrato) {
		this.contrato = contrato;
		
	}
	
	public Contrato getEstado() {
		return contrato;
	}
	

}
