
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel autenticavel) {
		if(autenticavel.autentica(this.senha)) {
			System.out.println("Acesso autorizado.");
		} else {
			System.out.println("Acesso negado.");
		}
	}
}
