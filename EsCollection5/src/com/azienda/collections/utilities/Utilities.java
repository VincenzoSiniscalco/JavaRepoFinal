package com.azienda.collections.utilities;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.azienda.collections.exception.DatiNonValidiException;
import com.azienda.collections.model.Studente;

public class Utilities {
	//metodo per validazione stringa
		
	public Studente aggiungiStudente(Scanner sc) throws DatiNonValidiException {
			Utilities util= new Utilities();	
			System.out.print("Nome studente: ");
			String nome = util.leggiStringa(sc);

			System.out.print("Cognome studente: ");
			String cognome = util.leggiStringa(sc);

			double media=util.leggiMedia(sc);

			Studente studente = new Studente(nome,cognome,media);
			return studente;
		
		}
	
	
	public String leggiStringa(Scanner sc) throws DatiNonValidiException {
			while(true) {
				String s= sc.nextLine();
				if(s.isEmpty()) {
					throw new DatiNonValidiException("\"Non puoi inserire una stringa vuota!\"", null);
				}
				return s;
			}
		}
		//metodo per validazione media	
		public double leggiMedia(Scanner sc) {
			double media = 0;
			while (true) {
				System.out.print("Media voti (0–30): ");
				String input = sc.nextLine().trim();
				try {
					media = Double.parseDouble(input);
					if (media < 0 || media > 30)
						throw new DatiNonValidiException("La media deve essere compresa tra 0 e 30.", null);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Errore: inserisci un numero valido.");
				} catch (DatiNonValidiException e) {
					System.out.println("Errore: " + e.getMessage());
				}
			}
			return media;
		}
		//stampa delle fasce studenti
		public void stampaFasce(Map<String, List<Studente>> fasceStudenti) {
			System.out.println("Elenco studenti per fasce: ");
			for(Map.Entry<String, List<Studente>> entry : fasceStudenti.entrySet()) {
				System.out.println(entry.getKey() + ":");
				List<Studente> lista= entry.getValue();
				if(lista.isEmpty()) {
					System.out.println("La lista è vuota!");
				}else {
					stampaLista(lista); 
				}
			}
			System.out.println("Programma terminato.");
		}
		//stampa della lista di studenti da richiamare in stampaFasce
		public void stampaLista(List<Studente> studenti) {
			for(Studente studente:studenti) {
				System.out.println(studente);
			}
		}
		//metodo per smistare gli studenti in fasce
		public String determinaFascia(double media) {
			if(media<0||media>30) {
				throw new IllegalArgumentException("La media dev'essere compresa tra 0 e 30!");
			}
			if (media>=26) return FasciaVoto.FASCIA_VOTO_1;
			else if (media<26 && media>=22) return FasciaVoto.FASCIA_VOTO_2;
			else if (media<22 && media>=18) return FasciaVoto.FASCIA_VOTO_3;
			else return FasciaVoto.FASCIA_VOTO_4;
		
		}
}
