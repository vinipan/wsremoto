package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {
	public static void main(String[] args) {
		String cargo = "";
		float salario=0;
		
			do {
				cargo = JOptionPane.showInputDialog("Cargo:");
				salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));
				JOptionPane.showMessageDialog(null, "O CONDENADO GANHA APENAS " + salario/160 + " A HORA");
			} while (JOptionPane.showConfirmDialog(null, "Deseja continuar, seu cabaço?","E AI?",JOptionPane.YES_NO_OPTION)==0);
			
			
		
		
		
				
		
		
		
		
		
		
		
	}
}