package br.com.bankofoz.deploy;

import br.com.bankofoz.model.Cliente;
import br.com.bankofoz.model.Conta;
import br.com.bankofoz.model.Corrente;
import br.com.bankofoz.model.Endereco;
import br.com.bankofoz.model.Poupanca;
import br.com.bankofoz.util.JanelaIn;

public class DeployConta {

	public static void main(String[] args) {
		
		Conta objConta  = null;
		char opt = JanelaIn.s("DIGITE C PARA CONTA CORRENTE \nDIGITE P PARA POUPAN�A").toLowerCase().charAt(0);
		
		if (opt == 'c') {
			objConta = new Corrente(
					JanelaIn.sh("NUMERO_CONTA"), 
					JanelaIn.b("DIGITO_CONTA"), 
					JanelaIn.sh("AGENCIA"), 
					JanelaIn.f("SALDO"), 
					new Cliente(
							123, 
							"ZEZINHO", 
							"zezinho@oz.com", 
							JanelaIn.bo("Zezinho � especial?"), 
							"123456789-09", 
							new Endereco(
									"Rua zez�",
									"335",
									"n tem",
									"JucaBairro",
									"NAB�POLIS",
									"SP",
									"06969-069"					
									)
							), 
					(float)1500.50, 
					(float)20.5
					);
		}
		
		if (opt == 'p') {
			objConta = new Poupanca(
					JanelaIn.sh("NUMERO_CONTA"), 
					JanelaIn.b("DIGITO_CONTA"), 
					JanelaIn.sh("AGENCIA"), 
					JanelaIn.f("SALDO"), 
					new Cliente(
							123, 
							"ZEZINHO", 
							"zezinho@oz.com", 
							JanelaIn.bo("Zezinho � especial?"), 
							"123456789-09", 
							new Endereco(
									"Rua zez�",
									"335",
									"n tem",
									"JucaBairro",
									"NAB�POLIS",
									"SP",
									"06969-069"					
									)
							), 
					(float)120.37
					);
		}
		
		
		System.out.println(objConta.toString());
		objConta.debitarTaxa();
		System.out.println(objConta.toString());
		System.out.println(objConta.sacar(8000));
		objConta.aumentarLimite(50);
		System.out.println(objConta.getSaldo());
		System.out.println(objConta.toString());
		
		
		
		

	}

}
