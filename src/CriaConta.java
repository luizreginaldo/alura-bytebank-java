
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(1234, 12345);
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(1234, 54321);
		segundaConta.deposita(50);
		
		System.out.println("primeira conta tem: " + primeiraConta.getSaldo());
		System.out.println("segunda conta tem: " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getNumero());
		
		System.out.println(segundaConta.getAgencia());
		
		segundaConta.setAgencia(146);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	
	}
}
