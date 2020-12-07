package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		//Criar pela pai e instanciar pela filha: List --> ArrayList
		int[] numeros = new int [5]; //vetor padrão, vetor de dados homogênios, numeros limitados
		List<String> lista = new ArrayList<String>(); //definir tipos de dados da lista (generics)
		//List<String> lista = new ArrayList<>(); // <> usado a partir da versão de java 7 
		lista.add("Analista");
		lista.add("EstagOtario");
		lista.add("DBA Juninho");
		lista.add("DBA Sr");
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		lista.remove(1);
		System.out.println("Segundo ADEUS: " + lista);
		System.out.println("Segundo ADEUS: " + lista.get(0));
		for (int cont=0; cont<lista.size();cont++) {
			System.out.println("Cargo " + cont + " é " + lista.get(cont));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
