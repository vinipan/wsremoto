package br.com.bankofoz.model;

public class Corrente extends Conta{
	
	private float limite;
	private float taxa;
	
	public boolean sacar(float valor) {
		if ((super.getSaldo() + this.limite) >= valor && valor > 0) {
			super.setSaldo(super.getSaldo() - valor);
			return true;
		}
		return false; 
	}
	
	public float verificarSaldo() {
		return super.getSaldo() + this.limite;
	}
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo() - this.taxa);
	}
	
	public void aumentarLimite(float porc) {
		this.limite += this.limite * (porc/100);
	}
	
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + " " + super.toString() + "]";
	}

	public Corrente() {
		super();
	}

	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}	
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	
	
	
	
	
	
	

}
