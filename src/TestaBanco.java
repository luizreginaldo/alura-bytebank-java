
public class TestaBanco {

	public static void main(String[] args) {
		Cliente clienteA = new Cliente();
		clienteA.nome = "Cliente A";
		clienteA.cpf = "123.456.789-10";
		clienteA.profissao = "Engenheiro";
		
		Conta contaA = new Conta();
		contaA.deposita(100);
		contaA.titular = clienteA;
		System.out.println(contaA.titular.nome);
		System.out.println(contaA.saldo);
	}
}
