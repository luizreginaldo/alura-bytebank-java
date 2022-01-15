package teste;

import modelo.Administrador;
import modelo.Cliente;
import modelo.Gerente;
import modelo.SistemaInterno;

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
