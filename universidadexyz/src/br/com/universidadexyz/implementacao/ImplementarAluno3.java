package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Aluno;

public class ImplementarAluno3 {

	public static void main(String[] args) {

		Aluno objAluno = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("CPF")		
				);
		
		System.out.println(objAluno.getAll());

	}

}
