package br.com.bytebank.banco.modelo;

public class MinhaExcecao extends Exception {
	private static final long serialVersionUID = 2042432446655093912L;

	public MinhaExcecao(String message) {
		super(message);
	}
}
