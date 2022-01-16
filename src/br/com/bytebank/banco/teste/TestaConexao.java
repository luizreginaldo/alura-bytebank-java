package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conexao;

public class TestaConexao {
	
	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.lerDados();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		//-----------------------------------
//		Conexao conexao = null;
//		try {
//			conexao = new Conexao();
//			conexao.lerDados();
//		} catch (IllegalStateException e) {
//			e.printStackTrace();
//		} finally {
//			conexao.fecha();
//		}
		
		System.out.println("test");
	}
}
