package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		
		Curso objCurso = new Curso();
		
		objCurso.setAll("ASPONE", (float) 3500, (short) 200, "AP", 58768, 5498);
		System.out.println(objCurso.getPromocao());
		System.out.println(objCurso.getAll());

	}

}