
public class TestaValores {

	public static void main(String[] args) {
		
		new Conta(1337, 24226);
		new Conta(1337, 24227);
		new Conta(1337, 24228);
		
		System.out.println("o total de contas é " + Conta.getTotal());
	}
}
