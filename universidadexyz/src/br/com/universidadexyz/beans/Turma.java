package br.com.universidadexyz.beans;

public class Turma {
	
	private int numero;
	private String sala;
	private String periodo;
	private Aluno aluno;	
	private Professor professor;
	private Curso curso;
	
	
		
	public Turma() {
		
	}

	public Turma(int numero, String sala, String periodo, Aluno aluno, Professor professor, Curso curso) {
		this.numero = numero;
		this.sala = sala;
		this.periodo = periodo;
		this.aluno = aluno;
		this.professor = professor;
		this.curso = curso;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	public void setAll(int numero, String sala, String periodo, Aluno aluno, Professor professor, Curso curso) {
		this.numero = numero;
		this.sala = sala;
		this.periodo = periodo;
		this.aluno = aluno;
		this.professor = professor;
		this.curso = curso;
	}

	public String getAll() {
		return "Turma [numero=" + numero + ", sala=" + sala + ", periodo=" + periodo + ", aluno=" + aluno.getAll()
				+ ", professor=" + professor.getAll() + ", curso=" + curso.getAll() + "]";
	}
	
	
	
	

}
