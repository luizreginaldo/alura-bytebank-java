
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaA = new Conta();
		contaA.saldo = 100;
		contaA.deposita(50);
		System.out.println(contaA.saldo);
		
		boolean conseguiuRetirar = contaA.saca(20);
		System.out.println(contaA.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaB = new Conta();
		contaB.deposita(1000);
		boolean sucessoTransferencia = contaB.transfere(300, contaA);
		if(sucessoTransferencia) {
			System.out.println("transferência com sucesso.");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println("saldo contaA: " + contaA.saldo);
		System.out.println("saldo contaB: " + contaB.saldo);
		
	}
}
