
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaA = new Conta();
		System.out.println(contaA.getSaldo());
		System.out.println(contaA.titular); //null
//		System.out.println(contaA.titular.nome); //NullPointerException
		
		contaA.titular = new Cliente();
		System.out.println(contaA.titular);
		
		contaA.titular.nome = "Cliente A";
		System.out.println(contaA.titular.nome);
	}
}
