package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaSacaValoresNegativos {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(7, 8);
		conta.deposita(100);
		try {
			conta.saca(200);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());

	}
}
