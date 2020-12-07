package br.com.excecoes.implementacao;

import tratarexcecao.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("7");
			System.out.println("numero: " + numero);
			
			String palavra = "";
			System.out.println("qtde chars: " + palavra.length());
			int[] valores = new int [2];
			valores[0] = 1;
			valores[1] = 2;
			valores[2] = 2;
		}
		
		catch (Exception erro ) {
			System.out.println(MinhaExcecao.tratar(erro));;

		}
		
				
		finally {
			System.out.println("se fode ai");
		}
		
		
		
		
		
		
		
		

	}

}
