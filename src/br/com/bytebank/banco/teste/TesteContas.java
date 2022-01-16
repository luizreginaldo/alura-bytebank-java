package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.deposita(200);
		
		try {
			contaCorrente.transfere(10, contaPoupanca);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		try {
			contaCorrente.saca(10);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println("C/C: " + contaCorrente.getSaldo());
		System.out.println("C/P: " + contaPoupanca.getSaldo());

	}

}
