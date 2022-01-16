package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TestaTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorImposto calculadorImposto = new CalculadorImposto();
		calculadorImposto.registra(contaCorrente);
		calculadorImposto.registra(seguroDeVida);
		
		System.out.println("Total: " + calculadorImposto.getTotalImposto());

	}

}
