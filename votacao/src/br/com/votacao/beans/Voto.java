package br.com.votacao.beans;

public class Voto {
	
	private Pessoa eleitor;	
	private Pessoa candidato;
	private boolean primeiroTuno;
	
		
	@Override
	public String toString() {
		return "Voto [eleitor=" + eleitor + ", candidato=" + candidato + ", primeiroTuno=" + primeiroTuno + "]";
	}
	public Voto() {
		super();
	}
	public Voto(Pessoa eleitor, Pessoa candidato, boolean primeiroTuno) {
		super();
		this.eleitor = eleitor;
		this.candidato = candidato;
		this.primeiroTuno = primeiroTuno;
	}
	public Pessoa getEleitor() {
		return eleitor;
	}
	public void setEleitor(Pessoa eleitor) {
		this.eleitor = eleitor;
	}
	public Pessoa getCandidato() {
		return candidato;
	}
	public void setCandidato(Pessoa candidato) {
		this.candidato = candidato;
	}
	public boolean isPrimeiroTuno() {
		return primeiroTuno;
	}
	public void setPrimeiroTuno(boolean primeiroTuno) {
		this.primeiroTuno = primeiroTuno;
	}
	
	

}
