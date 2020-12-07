package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Aluno;

public class ImplementarAluno2 {

	public static void main(String[] args) {
		Aluno objAluno = new Aluno();
		
		objAluno.setAll (
				Integer.parseInt(JOptionPane.showInputDialog("RM")), 
				JOptionPane.showInputDialog("NOME"), 
				JOptionPane.showInputDialog("CPF")
				);
		
		System.out.println(objAluno.getAll());
		
		
		
		

	}

}
