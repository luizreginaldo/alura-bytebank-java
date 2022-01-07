
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.deposita(200);
		
		contaCorrente.transfere(10, contaPoupanca);
		contaCorrente.saca(10);
		
		System.out.println("C/C: " + contaCorrente.getSaldo());
		System.out.println("C/P: " + contaPoupanca.getSaldo());

	}

}
