package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {
		
		Professor objProfessor = new Professor();
		Endereco objEndereco = new Endereco();
		
		objProfessor.setApelido("Z�z�o");
		objProfessor.setId(69);
		objProfessor.setFormacao("Dot�");
		objProfessor.setValorHora(120);
		
		objEndereco.setLogradouro("CASA DO CARAIO");
		objEndereco.setNumero("6969");
		objEndereco.setBairro("CACILDAS");
		objEndereco.setCidade("DA SUA M�E");
		objEndereco.setUf("KCT");
		objEndereco.setCep("06969-069");
		
		objProfessor.setEndereco(objEndereco);
		
		System.out.println(objProfessor.getApelido());
		System.out.println(objProfessor.getFormacao());
		System.out.println(objProfessor.getEndereco().getBairro());
		
		
		
		
		
		
		
		

	}

}
