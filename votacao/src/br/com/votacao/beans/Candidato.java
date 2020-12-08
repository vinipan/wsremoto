package br.com.votacao.beans;

public class Candidato extends Pessoa {
	
	private int numero; 
	private String cargo;
	private String partido;
	
		
	@Override
	public String toString() {
		return "Candidato [numero=" + numero + ", cargo=" + cargo + ", partido=" + partido + super.toString() + "]";
	}

	public void setAll(int numero, String cargo, String partido) {
		super.setAll(partido);
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
	}
	
	public Candidato() {
		super();
	}
	
	
	public Candidato(String nome, int numero, String cargo, String partido) {
		super(nome);
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	
	
}
