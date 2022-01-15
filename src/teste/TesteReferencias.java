package teste;

import modelo.Conta;
import modelo.ContaCorrente;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new ContaCorrente(9, 12);
		primeiraConta.deposita(300);
		
		System.out.println("saldo da primeira: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		segundaConta.deposita(100);
		
		System.out.println("saldo da segunda: " + segundaConta.getSaldo());
		System.out.println("saldo da primeira: " + primeiraConta.getSaldo());
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
