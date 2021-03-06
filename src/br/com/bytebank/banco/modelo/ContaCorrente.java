package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		super.saca(valor + .2);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * .01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.getNumero();
	}
}
