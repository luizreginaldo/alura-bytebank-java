
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaA = new ContaCorrente(1, 2);
		contaA.deposita(100);
		contaA.deposita(50);
		System.out.println(contaA.getSaldo());
		
		try {
			contaA.saca(20);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		System.out.println(contaA.getSaldo());
		
		Conta contaB = new ContaPoupanca(3, 4);
		contaB.deposita(1000);
		try {
			contaB.transfere(300, contaA);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println("saldo contaA: " + contaA.getSaldo());
		System.out.println("saldo contaB: " + contaB.getSaldo());
		
	}
}
