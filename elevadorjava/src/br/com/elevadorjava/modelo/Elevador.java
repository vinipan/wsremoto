package br.com.elevadorjava.modelo;

public class Elevador {
	
	//PROPRIEDADES
	
	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private byte capacidadePessoas;
	private byte qtdeAtual;
	private short andarAtual;
	
	
	public void definirValores (String pNome, short pAndarMax, short pAndarMin, byte pCapacidade ) {
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapacidade;
		
	}
	
	public void subir () {
		if (andarAtual < andarMaximo) {
			andarAtual++;	
		}		
	}
	
	public void descer () {
		if (andarAtual > andarMinimo) {
			andarAtual--;	
		}		
	}
	
	public String exibirDados () {
		return "Nome: " + nome + "\nAndar atual: " + andarAtual + "\nQuantidade de pessoas: " + qtdeAtual;
	}
	
	public void entrar(byte pQtde) {
		if (qtdeAtual+pQtde <= capacidadePessoas) {
			qtdeAtual+=pQtde;
		}
		else{
			qtdeAtual=capacidadePessoas;
		}
	}
	
	public void sair (byte pQtde) {
		if (qtdeAtual-pQtde >= 0) {
			qtdeAtual-=qtdeAtual;
		}
		else{
			qtdeAtual=0;
		}
	}
	
	public void subir (short andar) {
		if (andar > andarAtual && andar <= andarMaximo) {
			andarAtual = andar;
		}		
	}
	
	public void descer (short andar) {
		if (andar < andarAtual && andar >= andarMinimo) {
			andarAtual = andar;
		}
	}

}
