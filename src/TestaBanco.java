
public class TestaBanco {

	public static void main(String[] args) {
		Cliente clienteA = new Cliente();
		clienteA.setNome("Cliente A");
		clienteA.setCpf("123.456.789-10");
		clienteA.setProfissao("Engenheiro");
		
		Conta contaA = new Conta();
		contaA.deposita(100);
		contaA.setTitular(clienteA);
		System.out.println(contaA.getTitular().getNome());
		System.out.println(contaA.getSaldo());
	}
}
