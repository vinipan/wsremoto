package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exec3 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("1� numero INTEIRO"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("2� numero INTEIRO"));
		char operacao = JOptionPane.showInputDialog("Qual Operador?").charAt(0);
		double total = 0;
		
		if (operacao == '+')
		{
			total = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + total);
		} 
		else if (operacao == '-')
		{
			total = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + total);
		} 
		else if (operacao == '*')
		{
			total = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + total);
		}
		else if (operacao == '/')
		{
			total = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + total);
		}
		else
		{
			System.out.println("OPERA��O INV�LIDA!!!!!!!!");
		}
		
				
	}

}
