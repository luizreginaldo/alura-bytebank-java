
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel funcionarioAutenticavel) {
		if(funcionarioAutenticavel.autentica(this.senha)) {
			System.out.println("Acesso autorizado.");
		} else {
			System.out.println("Acesso negado.");
		}
	}
}
