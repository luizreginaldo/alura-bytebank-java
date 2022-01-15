package teste;

import modelo.Conta;
import modelo.ContaCorrente;

public class TestaValores {

	public static void main(String[] args) {
		
		new ContaCorrente(1337, 24226);
		new ContaCorrente(1337, 24227);
		new ContaCorrente(1337, 24228);
		
		System.out.println("o total de contas é " + Conta.getTotal());
	}
}
