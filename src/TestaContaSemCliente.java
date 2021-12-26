
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaA = new Conta();
		System.out.println(contaA.getSaldo());
		System.out.println(contaA.getTitular()); //null
//		System.out.println(contaA.getTitular().nome); //NullPointerException
		
		contaA.setTitular(new Cliente());
		System.out.println(contaA.getTitular());
		
		contaA.getTitular().nome = "Cliente A";
		System.out.println(contaA.getTitular().nome);
	}
}
