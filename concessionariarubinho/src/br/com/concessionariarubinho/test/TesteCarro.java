package br.com.concessionariarubinho.test;

import javax.swing.JOptionPane;

import br.com.concessionariarubinho.modelo.CarroFormula1;

public class TesteCarro {

	public static void main(String[] args) {
		
		CarroFormula1 objeto = new CarroFormula1();
		
		objeto.preencherEscuderia(JOptionPane.showInputDialog("Escuderia"));
		objeto.preencherCor(JOptionPane.showInputDialog("Cor"));
		objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Valor")));
		System.out.println(objeto.ligar());
		objeto.acelerar(20);
		objeto.acelerar(35);
		
		System.out.println("Velocidade:" + objeto.retornarVelocidade());
		System.out.println(objeto.ligar());
		objeto.frear();
		System.out.println("Velocidade: " + objeto.retornarVelocidade());
		System.out.println(objeto.desligar());
		System.out.println(objeto.desligar());
		
		
		System.out.println(objeto.retornarEscuderia()+"\n"+objeto.retornarCor()+"\n"+objeto.retornarValor());
		
		
		

	}

}
