package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("NOME?").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade: "));
		
		if (idade > 70 || (idade == 16 || idade == 17))
		{
			System.out.println(nome + " VOTO FACULTATIVO. NÃO PERCA SEU TEMPO!");
		}
		else if (idade < 16)
		{
			System.out.println(nome + " NÃO PODE VOTAR, AINDA BEM.");
		}
			else
			{
				System.out.println(nome + " VOTO OBRIGATÓRIO! PERDEU!!!");
			}
		

		
		
		
		
		
		
		
		
	}

}
