package br.com.bankofoz.model;

public class Poupanca extends Conta {
	private float rendimento;

	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}
	
	public void creditarRendimentos() {
		super.setSaldo(super.getSaldo() + this.rendimento); 
	}
	
	public float verificarSaldo() {
		return super.getSaldo();
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + " " + super.toString() + "]";
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	
	

}
