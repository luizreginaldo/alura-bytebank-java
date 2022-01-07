
public class TestaSacaValoresNegativos {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(7, 8);
		conta.deposita(100);
		System.out.println(conta.saca(200));
		System.out.println(conta.getSaldo());

	}
}
