package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio4 {

	public static void main(String[] args) {
		
		
		short qtdMaiorIdade = 0;
		float mediaIdade = 0;
		String nome = "";
		short idade = 0;
		String maisVeio = "";
		short idadeMaisVeio = 0;
		short idadeMaisNovo = 0;
		String maisNovo = "";
		int somaIdade = 0;
		int totalPessoas = 0;
		
		do {
			nome = JOptionPane.showInputDialog("Digite o nome do funalo");
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade do" + nome));
			somaIdade += idade;
			totalPessoas++;
			
			if (idade >= 18 ) {
				qtdMaiorIdade++;
			}
			
			if (idade > idadeMaisVeio) {
				idadeMaisVeio = idade;
				maisVeio = nome;
			} else if (idade < idadeMaisNovo && idade != 0) {
				idadeMaisNovo = idade;
				maisNovo = nome;
			}		
			
		} while (JOptionPane.showConfirmDialog(null, "Deseja imputar mais dados?","E AI?",JOptionPane.YES_NO_OPTION)==0);
		
		mediaIdade = (float) somaIdade / totalPessoas; 
		
		System.out.println("Qtde maiores de idade: " + qtdMaiorIdade);
		System.out.printf("Media Idade: %f2\n", mediaIdade );
		System.out.println("Mais v�io: " + maisVeio + " Idade: " + idadeMaisVeio);
		System.out.println("Mais v�io: " + maisNovo + " Idade: " + idadeMaisNovo);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
