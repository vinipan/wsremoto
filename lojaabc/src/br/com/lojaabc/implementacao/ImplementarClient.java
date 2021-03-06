package br.com.lojaabc.implementacao;

import br.com.lojaabc.beans.PessoaFisica;
import br.com.lojaabc.beans.PessoaJuridica;
import br.com.lojaabc.util.JanelaIn;

public class ImplementarClient {

	public static void main(String[] args) {
		
		char opcao = JanelaIn.s("Digite F para PF").charAt(0);
		
		if (opcao == 'F') {
			PessoaFisica objCliente = new PessoaFisica();
			objCliente.setNome(JanelaIn.s("Nome"));
			objCliente.setCpf(JanelaIn.s("CPF"));
			objCliente.setEmail(JanelaIn.s("Email").toLowerCase());
			objCliente.setEspecial(JanelaIn.b("Cliente Especial?"));
			objCliente.setId(JanelaIn.i("C�digo"));
			objCliente.setNascimento(JanelaIn.s("Nascimento"));
			objCliente.setRg(JanelaIn.s("RG"));
		}else {
			PessoaJuridica objCliente = new PessoaJuridica();
			objCliente.setNome(JanelaIn.s("Nome"));
			objCliente.setEmail(JanelaIn.s("Email").toLowerCase());
			objCliente.setEspecial(JanelaIn.b("Cliente Especial?"));
			objCliente.setId(JanelaIn.i("C�digo"));
			objCliente.setCnpj(JanelaIn.s("CNPJ"));
			objCliente.setContato(JanelaIn.s("Contato"));
			
		}

		
		
		                     

	}

}
