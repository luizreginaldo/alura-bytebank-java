
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaA = new ContaCorrente(1, 2);
		contaA.deposita(100);
		contaA.deposita(50);
		System.out.println(contaA.getSaldo());
		
		contaA.saca(20);
		System.out.println(contaA.getSaldo());
		
		Conta contaB = new ContaPoupanca(3, 4);
		contaB.deposita(1000);
		contaB.transfere(300, contaA);
		
		System.out.println("saldo contaA: " + contaA.getSaldo());
		System.out.println("saldo contaB: " + contaB.getSaldo());
		
	}
}
