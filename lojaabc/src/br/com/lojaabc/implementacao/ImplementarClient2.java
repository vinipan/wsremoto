package br.com.lojaabc.implementacao;

import br.com.lojaabc.beans.Cliente;
import br.com.lojaabc.beans.PessoaFisica;
import br.com.lojaabc.beans.PessoaJuridica;
import br.com.lojaabc.util.JanelaIn;

public class ImplementarClient2 {

	public static void main(String[] args) {
		
		char opcao = JanelaIn.s("Digite F para PF").charAt(0);
		Cliente objCliente = null;
		
		
		
		if (opcao == 'F') {
			objCliente = new PessoaFisica(
					JanelaIn.i("ID"),
					JanelaIn.s("Nome"),
					JanelaIn.s("EMAIL").toLowerCase(),
					JanelaIn.b("Especial"),
					JanelaIn.s("CPF"),
					JanelaIn.s("RG"),
					JanelaIn.s("Nascimento")
					);
		}else {
			objCliente = new PessoaJuridica(
					JanelaIn.i("ID"),
					JanelaIn.s("Nome"),
					JanelaIn.s("EMAIL").toLowerCase(),
					JanelaIn.b("Especial"),
					JanelaIn.s("CNPJ"),
					JanelaIn.s("Contato")
					);
			
			if (objCliente instanceof PessoaJuridica) {
				System.out.println("OBJETO DA CLASSE PessoaJuridica");
			}            
			
			
		}

		
		
		                     

	}

}
