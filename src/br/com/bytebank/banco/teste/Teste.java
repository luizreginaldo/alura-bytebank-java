package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
	
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(123,321);
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		System.out.println(contaCorrente);
		
		println("x");
		println(3);
		println(false);
		println(contaCorrente);
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	static void println(Object o) {}
}
