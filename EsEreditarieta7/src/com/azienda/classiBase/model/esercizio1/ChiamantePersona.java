package com.azienda.classiBase.model.esercizio1;


public class ChiamantePersona {

	public static void main(String[] args) {

		for(int i=0;i<20;i++) {
			Persona p_i= new Persona("Nome_"+i, "Cognome_"+i, 100.0f);
			System.out.println(p_i.stampaDescrizione()); 
			i++;
			Bambino b_i= new Bambino("Nome_"+i, "Cognome_"+i, 100.0f);
			System.out.println(b_i.stampaDescrizione()); 		}
		
		System.out.println("Sono stati creati "+Bambino.getContatoreBambini()+ " bambini.");
		System.out.println("In totale sono state create "+Bambino.getContatorePersone()+ " persone.");
	}

}

