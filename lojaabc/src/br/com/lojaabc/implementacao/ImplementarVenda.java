package br.com.lojaabc.implementacao;

import br.com.lojaabc.beans.Cliente;
import br.com.lojaabc.beans.Fabricante;
import br.com.lojaabc.beans.Produto;
import br.com.lojaabc.beans.Venda;
import br.com.lojaabc.util.JanelaIn;

public class ImplementarVenda {

	public static void main(String[] args) {
		Venda objVenda = new Venda(
									0001, 
									new Produto(
												0101,
												"PNEU",
												JanelaIn.f("ValorCompra"),
												JanelaIn.f("ValorVenda"),
												200,
												new Fabricante(
															"123456789/10000",
															"PICARETA'S INC.",
															"(11)0000-1111"
															)
												), 
									new Cliente(
												6969, 
												"Zé das Couves", 
												"zedas@couves.com", 
												JanelaIn.b("CLIENTE ESPECIAL?")
												), 
									JanelaIn.i("Quantidade Vendido"), 
									0);
		
		System.out.println(objVenda.toString());
		objVenda.calcularTotal();
		System.out.println(objVenda.toString());
		
		
	
	}

}
