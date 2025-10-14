package com.azienda.collection.ui;

import com.azienda.collection.model.Corso;
import com.azienda.collection.model.Persona;

public class TestCorso {

	public static void main(String[] args) {
		try {
			Persona[] studenti= {
					new Persona("Mario","Rossi"),
					new Persona("Anna","Verdi"),
			};
			Corso c= new Corso("Pippo","Java",studenti);
			System.out.println(c.getStudenti()[1].getNome());
			
			printStudenti(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void printStudenti(Corso corso) {
//		Persona[] studenti = corso.getStudenti();
		for(Persona p: corso.getStudenti()) {
			System.out.println(p);
		}
	}

}
