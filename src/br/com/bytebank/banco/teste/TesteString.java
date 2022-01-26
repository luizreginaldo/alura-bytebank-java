package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		System.out.println(vazio.trim().isEmpty());
		
		String nome = "Alura"; //object literal
		
		System.out.println(nome.contains("lu"));
		
		String outro = new String("Alura");
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String substring = nome.substring(1);
		System.out.println(substring);
		
		int indexOf = nome.indexOf("ur");
		System.out.println(indexOf);
		
		char myChar = nome.charAt(0);
		System.out.println(myChar);
		
		String replace = nome.replace("Al", "aL");
		System.out.println(replace);
		
		String toUpperCase = nome.toUpperCase();
		System.out.println(toUpperCase);
		
		String replaceChar = nome.replace('l', 'L');
		System.out.println(replaceChar);
		
	}

}
