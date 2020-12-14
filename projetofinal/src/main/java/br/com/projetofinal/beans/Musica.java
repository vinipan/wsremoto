package br.com.projetofinal.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_musica")
public class Musica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "titulo", length=40)
	private String titulo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "cadastro")
	private Date cadastro;
	
	@Column(name = "lancamento")
	private int lancamento;
	
	@JsonIgnoreProperties("musicas")
	@ManyToOne // esse é o lado "N" no SGBD relacional
	private Artista artista;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getCadastro() {
		return cadastro;
	}
	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}
	public int getLancamento() {
		return lancamento;
	}
	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	public Musica(int id, String titulo, Date cadastro, int lancamento, Artista artista) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.cadastro = cadastro;
		this.lancamento = lancamento;
		this.artista = artista;
	}
	public Musica() {
		super();
	}	
	
	
	
	
	
}
