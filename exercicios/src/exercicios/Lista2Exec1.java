package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exec1 {

	public static void main(String[] args) {
		String cliente = JOptionPane.showInputDialog("Nome do Cliente:").toUpperCase();
		short nDiarias = Short.parseShort(JOptionPane.showInputDialog("Numero de di�rias:"));
		float taxa = 8;
		float total = 0;
		if (nDiarias > 15)
		{
			taxa =  (float) 5.5;
		} else if (taxa == 15)
		{
			taxa =  6;
		}
		
		total = (float) (taxa*nDiarias);
		
		System.out.println("O TOTAL DA CONTA DE " + cliente +" �..........               : R$" + total);
				
	}

}
