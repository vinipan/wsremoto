package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		while (!email.contains("@"))
		{
			 email = JOptionPane.showInputDialog("seu animal").toLowerCase();
		}
		System.out.println(email);

		
		
		
		
		
		
		
		
		
		
		
		
	}
}