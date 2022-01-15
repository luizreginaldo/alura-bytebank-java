package teste;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente clienteA = new Cliente();
		clienteA.setNome("Cliente A");
		clienteA.setCpf("123.456.789-10");
		clienteA.setProfissao("Engenheiro");
		
		Conta contaA = new ContaCorrente(1234, 12345);
		contaA.deposita(100);
		contaA.setTitular(clienteA);
		System.out.println(contaA.getTitular().getNome());
		System.out.println(contaA.getSaldo());
	}
}
