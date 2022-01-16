package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Administrador;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Gerente;
import br.com.bytebank.banco.modelo.SistemaInterno;

public class TesteSistema {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		Administrador administrador = new Administrador();
		administrador.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(administrador);
		sistemaInterno.autentica(cliente);

	}

}
