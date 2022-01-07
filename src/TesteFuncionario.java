
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente();
		funcionario.setNome("Luiz Reginaldo");
		funcionario.setCpf("123.456.789-10");
		funcionario.setSalario(2600);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
//		funcionario.salario = 200;
	}
}
