package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("NOME?").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade: "));
		
		if (idade > 70 || (idade == 16 || idade == 17))
		{
			System.out.println(nome + " VOTO FACULTATIVO. N�O PERCA SEU TEMPO!");
		}
		else if (idade < 16)
		{
			System.out.println(nome + " N�O PODE VOTAR, AINDA BEM.");
		}
			else
			{
				System.out.println(nome + " VOTO OBRIGAT�RIO! PERDEU!!!");
			}
		

		
		
		
		
		
		
		
		
	}

}
