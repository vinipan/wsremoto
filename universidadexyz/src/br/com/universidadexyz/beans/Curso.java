package br.com.universidadexyz.beans;

public class Curso {
	
	private String descricao;
	private float valor;
	private short cargaHoraria;
	private String sigla;
	private int id;
	private int duracao;
	
	public Curso() {
		
	}

	public Curso(String descricao, float valor, short cargaHoraria, String sigla, int id, int duracao) {
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
		this.sigla = sigla;
		this.id = id;
		this.duracao = duracao;
	}

	public String getAll() {
		return "Descri��o....: " + this.descricao + "\n" + 
			   "Valor........: " + this.valor + "\n" +
			   "Carga Hor�ria: " + this.cargaHoraria + "\n" +
			   "Sigla........: " + this.sigla + "\n" +
			   "ID...........: " + this.id + "\n" +
			   "Dura��o......: " + this.duracao;
	}
	
	public void setAll (String descricao, float valor, short cargaHoraria, String sigla, int id, int duracao) {
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
		this.sigla = sigla;
		this.id = id;
		this.duracao = duracao;	
	}
	
	public float getPromocao() {
		return this.valor * (float) 0.9;
	}
	
	public float getPromocao(float percentPromo) {
		return this.valor - valor * (percentPromo/100);
	}
	
	public void setAjustaValor (float percentAjuste) {
		this.valor += this.valor * (percentAjuste/100);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public short getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(short cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	

}
