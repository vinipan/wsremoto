package br.com.votacao.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;

public class ImplementarVoto {

	public static void main(String[] args) {
		
		List<Voto> listaVotos = new ArrayList<Voto>();
		List<Urna> listaUrna = new ArrayList<Urna>();
		
		Voto objVoto1 = new Voto(
					new Eleitor(
							"ZÉ",
							28887, 
							true),
							new Candidato(
									"ROUBALDO",
									001,
									"picareta",
									"PNC"
									), 
							true
							);
		
		Voto objVoto2 = new Voto(
				new Eleitor(
						"JUCA",
						28888, 
						true),
						new Candidato(
								"ROUBALDO",
								001,
								"picareta",
								"PNC"
								), 
						true
						);
		
		Voto objVoto3 = new Voto(
				new Eleitor(
						"JÃO",
						28889, 
						true),
						new Candidato(
								"AFANÁSIO",
								002,
								"salafrário",
								"PVSF"
								), 
						true
						);
		listaVotos.add(objVoto1);
		listaVotos.add(objVoto2);
		listaVotos.add(objVoto3);
				
		Urna objUrna = new Urna(
								69, 
								171, 
								"roubópolis", 
								listaVotos);
		
		System.out.println(objUrna.toString());
		short i = 0;
		do {
			
			objUrna = new Urna(
					69+i, 
					171, 
					"roubópolis", 
					listaVotos);
			listaUrna.add(objUrna);
			
			i++;
		}while (JOptionPane.showConfirmDialog(null, "CADASTRAR NOVA URNA?","E AI?",JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println(listaUrna);
			
		
		
		
								

	}

}
