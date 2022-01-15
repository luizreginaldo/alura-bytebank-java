package teste;

import modelo.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Reginaldo");
		gerente.setCpf("12345678910");
		gerente.setSalario(5000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(123456);
		
		System.out.println(gerente.autentica(123456));
		
		System.out.println(gerente.getBonificacao());
	}
}
