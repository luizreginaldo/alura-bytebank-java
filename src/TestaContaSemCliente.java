
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaA = new Conta(1234, 12345);
		System.out.println(contaA.getSaldo());
		System.out.println(contaA.getTitular()); //null
//		System.out.println(contaA.getTitular().getNome()); //NullPointerException
		
		contaA.setTitular(new Cliente());
		System.out.println(contaA.getTitular());
		
		contaA.getTitular().setNome("Cliente A");
		System.out.println(contaA.getTitular().getNome());
	}
}
