package modelo;

public class SaldoInsuficienteException extends Exception {
	private static final long serialVersionUID = -6116238569354930430L;
	
	public SaldoInsuficienteException(String message) {
		super(message);
	}

}
