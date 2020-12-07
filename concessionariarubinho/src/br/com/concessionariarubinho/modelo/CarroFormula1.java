package br.com.concessionariarubinho.modelo;

public class CarroFormula1 {
	
	private String cor;
	private float valor;
	private String escuderia;
	private float velocidade;
	private boolean status;
	
	//Sintaxe método
	// <modificador> <tipoo do retorno> <nomeDoMetodo> (<tipoParam> <nomeDoParametro>)
	
	public float retornarVelocidade() {
		return velocidade;
	}
	
	public void frear() {
		if (status) {
			velocidade = 0;
		}
	}
	
	
	public void acelerar (float param0) {
		if (param0>0 && status) {
			velocidade+=param0;
		}
	}
	
	
	public String desligar() {
		if (!status) {
			return "Carro já desligado, seu animal!";
		}
		status=false;
		velocidade=0;
		return "Carro desligado!";
		
	}
	
	
	public String ligar () {
		if (status) {
			return "Carro já ligado seu animal!";
		}
		status = true;
		return "Carro ligado agora";
	}
	
	public String retornarEscuderia() {
		return escuderia;
	}
	
	public String retornarCor() {
		return cor;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void preencherEscuderia (String param0) {
		escuderia = param0.toUpperCase();		
	}
	
	
	public void preencherCor (String param0) {
		cor = param0.toUpperCase();		
	}
	
	public void preencherValor (float param0) {
		if (param0>0) {
			valor = param0;
		}
		
	}
	 

}
