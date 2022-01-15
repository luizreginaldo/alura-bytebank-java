package teste;

import modelo.Conta;
import modelo.ContaPoupanca;

public class TesteCriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new ContaPoupanca(1234, 12345);
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new ContaPoupanca(1234, 54321);
		segundaConta.deposita(50);
		
		System.out.println("primeira conta tem: " + primeiraConta.getSaldo());
		System.out.println("segunda conta tem: " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getNumero());
		
		System.out.println(segundaConta.getAgencia());
		
		segundaConta.setAgencia(146);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	
	}
}
