package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		Aluno objAluno = new Aluno();
		objAluno.setCpf(JOptionPane.showInputDialog("CPF?"));
		objAluno.setNome(JOptionPane.showInputDialog("Nome?").toUpperCase());
		objAluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM?")));
		
		System.out.println("Nome: " + objAluno.getNome() +
				         "\nRM..: " + objAluno.getRm() +
				         "\nCPF.: " + objAluno.getCpf());
		
		/*JOptionPane.showMessageDialog(null, "Nome...: " + objAluno.getNome() + 
				"\nRM.........: " + objAluno.getRm() + 
				"\nCPF........: " + objAluno.getCpf());
		*/

	}

}
                            