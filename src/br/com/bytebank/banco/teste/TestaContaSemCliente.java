package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaA = new ContaCorrente(1234, 12345);
		System.out.println(contaA.getSaldo());
		System.out.println(contaA.getTitular()); //null
//		System.out.println(contaA.getTitular().getNome()); //NullPointerException
		
		contaA.setTitular(new Cliente());
		System.out.println(contaA.getTitular());
		
		contaA.getTitular().setNome("Cliente A");
		System.out.println(contaA.getTitular().getNome());
	}
}
