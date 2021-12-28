
public class TesteReferenciasFuncionarios {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Reginaldo");
		funcionario.setSalario(2000);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Luiz");
		gerente.setSalario(5000);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setNome("Silva");
		editorVideo.setSalario(2500);
		
		Designer designer = new Designer();
		designer.setSalario(2000);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(funcionario);
		controleBonificacao.registra(gerente);
		controleBonificacao.registra(editorVideo);
		controleBonificacao.registra(designer);
		
		System.out.println(controleBonificacao.getSoma());

	}

}
