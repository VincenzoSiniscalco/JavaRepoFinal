package com.azienda.ereditarieta.ui;

import com.azienda.ereditarieta.model.Figlio;
import com.azienda.ereditarieta.model.Nonno;
import com.azienda.ereditarieta.model.Padre;

public class TestEreditarieta {

	public static void main(String[] args) {
		
		Nonno n= new Nonno();
		n.setNomeNonno("Franco");
		Padre p=new Padre();
		p.setNomeNonno("Luigi");
		p.setNomePadre("Andrea");
		Figlio f= new Figlio();
		f.setNomeNonno("Luca");
		f.setNomePadre("Giovanni");
		f.setNomeFiglio("Giuseppe");
		System.out.println("Programma terminato.");
	}

}
