
public class TestaConexao {
	
	public static void main(String[] args) {
		
		Conexao conexao = null;
		
		try {
			conexao = new Conexao();
			conexao.lerDados();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} finally {
			conexao.fecha();
		}
		
	}
}
