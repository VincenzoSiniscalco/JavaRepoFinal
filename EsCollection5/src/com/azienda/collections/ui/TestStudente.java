package com.azienda.collections.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.azienda.collections.exception.DatiNonValidiException;
import com.azienda.collections.model.Studente;
import com.azienda.collections.utilities.FasciaVoto;
import com.azienda.collections.utilities.Utilities;

public class TestStudente {
	public static void main(String[] args) {

		
		Map<String, List<Studente>> studenti = null;
		HashMap<String, List<Studente>>fasceStudenti=inizializzaMappa(studenti);
		Utilities util= new Utilities();


		System.out.println("Inizio inserimento studenti: ");
		System.out.println("Inserisci 'ESC' per terminare il programma dopo ogni inserimento di uno studente: ");
		try(Scanner sc= new Scanner(System.in)) {
			boolean continua=true;

			while(continua){
				try {
//					System.out.print("Nome studente: ");
//					String nome = util.leggiStringa(sc);
//
//					System.out.print("Cognome studente: ");
//					String cognome = util.leggiStringa(sc);
//
//					double media=util.leggiMedia(sc);
//
//					Studente studente= new Studente(nome,cognome,media);
//					
					Studente studente=util.aggiungiStudente(sc);
					String fascia= util.determinaFascia(studente.getMediaVoti());
					
					fasceStudenti.get(fascia).add(studente);

					System.out.println("Studente aggiunto in fascia "+ fascia);
					System.out.println("Inserire un altro studente? (per terminare digita \"ESC\") ");
					String scelta= util.leggiStringa(sc);
					if(scelta.equalsIgnoreCase("ESC")) {
						continua=false;
					}


				}catch (DatiNonValidiException e) {
					e.getMessage();
					e.printStackTrace();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}

			util.stampaFasce(fasceStudenti);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static HashMap<String, List<Studente>> inizializzaMappa(Map<String, List<Studente>> mappa) {
		mappa= new HashMap<String, List<Studente>>();
		mappa.put(FasciaVoto.FASCIA_VOTO_1, new ArrayList<>()); //inizializzo le 4 fasce nella mappa
		mappa.put(FasciaVoto.FASCIA_VOTO_2, new ArrayList<>());
		mappa.put(FasciaVoto.FASCIA_VOTO_3, new ArrayList<>());
		mappa.put(FasciaVoto.FASCIA_VOTO_4, new ArrayList<>());
		return (HashMap<String, List<Studente>>) mappa;
	}
}

//	//metodo per validazione stringa
//	public static String leggiStringa(Scanner sc) throws DatiNonValidiException {
//		while(true) {
//			String s= sc.nextLine();
//			if(s.isEmpty()) {
//				throw new DatiNonValidiException("\"Non puoi inserire una stringa vuota!\"", null);
//			}
//			return s;
//		}
//	}
//	//metodo per validazione media	
//	public static double leggiMedia(Scanner sc) {
//		double media = 0;
//		while (true) {
//			System.out.print("Media voti (0–30): ");
//			String input = sc.nextLine().trim();
//			try {
//				media = Double.parseDouble(input);
//				if (media < 0 || media > 30)
//					throw new DatiNonValidiException("La media deve essere compresa tra 0 e 30.", null);
//				break;
//			} catch (NumberFormatException e) {
//				System.out.println("Errore: inserisci un numero valido.");
//			} catch (DatiNonValidiException e) {
//				System.out.println("Errore: " + e.getMessage());
//			}
//		}
//		return media;
//	}
//	//stampa delle fasce studenti
//	private static void stampaFasce(Map<String, List<Studente>> fasceStudenti) {
//		System.out.println("Elenco studenti per fasce: ");
//		for(Map.Entry<String, List<Studente>> entry : fasceStudenti.entrySet()) {
//			System.out.println(entry.getKey() + ":");
//			List<Studente> lista= entry.getValue();
//			if(lista.isEmpty()) {
//				System.out.println("La lista è vuota!");
//			}else {
//				for(Studente studente:lista) {
//					System.out.println(studente);
//				}
//			}
//		}
//		System.out.println("Programma terminato.");
//	}
//
//}
