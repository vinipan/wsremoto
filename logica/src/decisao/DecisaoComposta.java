package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Qual nome do produto?").toUpperCase();
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Quantidade do produto: " + produto));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do produto: " + produto));

		
		// && AND
		// || OR
		// ! NOT
		
		if (qtde >= 10 && qtde <= 20)
		{
			System.out.println(produto + " Est� com o estoque normal.");

		} 
		else if (qtde < 10)
		{
			System.out.println(produto + " Est� com o estoque baixo!");
		} else 
		{
			System.out.println(produto + " Est� com o estoque alto!");
		}
		
		if (valor > 1000)
		{
			System.out.println("Valor Alto: " + valor);
		}	
		
		
	}

}