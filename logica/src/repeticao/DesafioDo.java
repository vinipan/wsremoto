package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1 digite seu numero"));
		int palpite = Integer.parseInt(JOptionPane.showInputDialog("Jogador2 digite seu palpite"));
		byte i = 1;

		while (palpite != jogador1)
		{
			if (palpite < jogador1)
			{
				JOptionPane.showMessageDialog(null, "ERROU! \nO N�MERO A SER A DIVINHADO � MENOR" );
			}
			else {
				JOptionPane.showMessageDialog(null, "ERROU! \nO N�MERO A SER A DIVINHADO � MAIOR" );
			}			
			palpite = Integer.parseInt(JOptionPane.showInputDialog("TENTE DE NOVO"));
			i++;
		}

		JOptionPane.showMessageDialog(null,"ACERTOU EM "+i+" TENTATIVAS");
		
		












	}
}