package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;

public class ImplementaProvessor3 {

	public static void main(String[] args) {

		Professor objProfessor = new Professor(
				1, 
				"Juca", 
				"Dot�", 
				120, 
				new Endereco(
						"Rua zez�",
						"335",
						"n tem",
						"JucaBairro",
						"PauGrande",
						"SP",
						"06969-069"					
						)
				);
		
		System.out.println(objProfessor.getAll());

	}

}
