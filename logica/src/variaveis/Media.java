package variaveis;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		/*
		 * Crie uma aplica��o que receba:
		 * nome da disciplina
		 * nota do 1� semestre
		 * nota do 2� semestre
		 * calcule e exiba a m�dia aritm�tica entre as duas notas
		 */
		
		String disc = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 1� semestre: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 2� semestre: "));
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Disciplina: " + disc + "\nM�dia do jumentinho: " + media);
	

	}

}
