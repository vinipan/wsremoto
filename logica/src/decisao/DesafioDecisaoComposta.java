package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("NOME?").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2"));
		float media = (nota1+nota2)/2;
		
		// && AND
		// || OR
		// ! NOT
		
		if (media >= 6)
		{
			System.out.println(nome + " PASSOU NA SORTE!");

		} else	if (media < 4)
		{
			System.out.println(nome + " KKKKK PERDEU O ANO! BURRO!");
		} else 
		{
			System.out.println(nome + " EST� PELA HORA DA MORTE. \nVAI PRO EXAME!!!");
		}
		
		System.out.println("M�DIA DO ANIMAL DE TETAS: " + media);
		
	}

}
