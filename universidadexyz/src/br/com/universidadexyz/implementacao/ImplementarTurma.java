package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Aluno;
import br.com.universidadexyz.beans.Curso;
import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;
import br.com.universidadexyz.beans.Turma;
import br.com.universidadexyz.util.Magic;

public class ImplementarTurma {	


	public static void main(String[] args) {
		
		Turma objTuma = new Turma(
							 35, 
							Magic.s("SALA"), 
							"MADRUGADA", 
							new Aluno(
									6969, 
									"Zezinho", 
									"123456789-09"
									), 
							new Professor(
									69, 
									"TUBURCIO", 
									"Dotô", 
									(float)69.69, 
									new Endereco(
											"RUA NAO TE INTERESSA", 
											"357", 
											"NADA", 
											"N/A", 
											"ZAMBLE", 
											"ZB", 
											"000"
											)
									), 
							new Curso(
									"TROUXOLOGIA", 
									Magic.f("valor"), 
									(short)200, 
									"PNC", 
									0024, 
									83579)
							);
		
		System.out.println(objTuma.getAll());
							 
							 
							 

	}

}
