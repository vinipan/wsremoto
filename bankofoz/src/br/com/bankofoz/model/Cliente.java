package br.com.bankofoz.model;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private boolean especial;
	private String cpf;
	private Endereco endereco;
	
	
	public void setAll(int id, String nome, String email, boolean especial, String cpf, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.especial = especial;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", especial=" + especial + ", cpf=" + cpf
				+ ", endereco=" + endereco + "]";
	}
	public Cliente() {

	}
	public Cliente(int id, String nome, String email, boolean especial, String cpf, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.especial = especial;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
		
	
}
