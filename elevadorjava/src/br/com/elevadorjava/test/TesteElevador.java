package br.com.elevadorjava.test;

import br.com.elevadorjava.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador objElevador = new Elevador();
		
		objElevador.definirValores(
				"FomFom".toUpperCase(),
				(short) 50,
				(short) -50,
				(byte) 20);
		
		objElevador.subir();
		objElevador.subir();
		objElevador.descer((short) -500);
		objElevador.entrar((byte) 10);
		objElevador.entrar((byte) 20);
		objElevador.entrar((byte) 10);
		objElevador.sair((byte) 20);
		
		
		System.out.println(objElevador.exibirDados());
		
		
		
		
		

	}

}
