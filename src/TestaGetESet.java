
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new ContaPoupanca(1, 2);
//		conta.numero = 1337;		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	}
}
