package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exec4 {

	public static void main(String[] args) {
		int valorA = Integer.parseInt(JOptionPane.showInputDialog("1� valor:"));
		int valorB = Integer.parseInt(JOptionPane.showInputDialog("2� valor:"));
		int valorC = Integer.parseInt(JOptionPane.showInputDialog("3� valor:"));
		
		if (valorA >= valorB && valorA >= valorC)
		{
			if (valorB >= valorC)
			{
				System.out.println(valorA + ","+valorB + ","+valorC);	
			}
			else
			{
				System.out.println(valorA + ","+valorC + ","+valorB);
			}
			
		}
		else if (valorB >= valorC && valorC >= valorA)
		{
			System.out.println(valorB + ","+valorC + ","+valorA);
		}
		else if (valorB >= valorA)
		{
			System.out.println(valorC + ","+valorB + ","+valorA);
		}
		else
		{
			System.out.println(valorC + ","+valorB + ","+valorA);
		}
			
		

		
	}

} 


/*
package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exec4 {

	public static void main(String[] args) {
		int valorA = Integer.parseInt(JOptionPane.showInputDialog("1� valor:"));
		int valorB = Integer.parseInt(JOptionPane.showInputDialog("2� valor:"));
		int valorC = Integer.parseInt(JOptionPane.showInputDialog("3� valor:"));
				
		if (valorA >= valorB && valorA >= valorC)
		{
		else if (valorB >= valorC)
		{
			System.out.println(valorA + ","+valorB + ","+valorC);
		}
		else if (valorB >= A && valor)
			
			if (valorB >= valorC)
			{
					
			}
			else
			{
				
			}
			
		}
		else if (valorB >= valorC && valorC >= valorA)
		{
			System.out.println(valorB + ","+valorC + ","+valorA);
		}
		else if (valorB >= valorA)
		{
			System.out.println(valorC + ","+valorB + ","+valorA);
		}
		else
		{
			System.out.println(valorC + ","+valorB + ","+valorA);
		}
			
		

		
	}

}











*/