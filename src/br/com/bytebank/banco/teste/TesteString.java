package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal
//		String outro = new String("Alura");
		
		nome = nome.replace("A", "a");
		System.out.println(nome);
		nome = nome.toUpperCase();
		System.out.println(nome);
		
	}

}
