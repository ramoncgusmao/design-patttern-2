package command;

import java.util.Calendar;

public class Pedido {

	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataFinalizacao;
	
	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor  = valor;
		this.status = Status.NOVO;
		// TODO Auto-generated constructor stub
	}
	
	public void paga() {
		System.out.println("pagando - " +getCliente());
		
		status = Status.PAGO;
	}
	
	public void finaliza() {
		System.out.println("finalizando - " + getCliente());
		
		dataFinalizacao = Calendar.getInstance();
		status  = Status.ENTREGUE;
	}

	public String getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

}
