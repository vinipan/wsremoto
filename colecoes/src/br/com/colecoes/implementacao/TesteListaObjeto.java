package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		
		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("NOME"), 
					JOptionPane.showInputDialog("NIVEL"), 
					Float.parseFloat(JOptionPane.showInputDialog("SALARIO"))
					));			
		} while (JOptionPane.showConfirmDialog(null, "Continuar?", "Pregunta", JOptionPane.YES_NO_CANCEL_OPTION)==0);
		
		System.out.println("DESORDENADA: " + lista);
		Collections.sort(lista);
		System.out.println("ORDENADA : " + lista);
		
		/*
		float total = 0;
		for (Cargo cargo : lista) {
			if (cargo.getNivel().toLowerCase().equals("jr.")) {
				total+= cargo.getSalario();
			};
		}
		
		System.out.println("TOTAL: " + total);
		
		
		System.out.println(lista); */
		// TODO Auto-generated method stub

	}

}
