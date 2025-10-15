package com.azienda.collections.ui;

import java.util.ArrayList;
import java.util.Scanner;
import com.azienda.collections.exception.ContattoEsistenteException;
import com.azienda.collections.model.Rubrica;
import com.azienda.collections.utils.Utilities;

public class TestRubrica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utilities util = new Utilities();

		Rubrica rubrica = new Rubrica("Rubrica Personale", "2025", new ArrayList<>());

		boolean running = true;

		while (running) {
			System.out.println("\n--- MENU RUBRICA ---");
			System.out.println("1: Inserisci contatto");
			System.out.println("2: Aggiornamento completo contatto");
			System.out.println("3: Aggiornamento parziale contatto");
			System.out.println("4: Cancella contatto");
			System.out.println("5: Cancella contatto per numero");
			System.out.println("6: Ricerca contatto per nome");
			System.out.println("7: Ricerca contatto per cognome");
			System.out.println("8: Ricerca contatto per numero di telefono");
			System.out.println("9: Visualizza tutti i contatti");
			System.out.println("10: Visualizza contatti ordinati per nome");
			System.out.println("11: Visualizza contatti ordinati per cognome");
			System.out.println("12: Visualizza contatti ordinati per cognome e nome");
			System.out.println("Digitare 'esc' per uscire");
			System.out.print("Seleziona operazione: ");

			String scelta = sc.nextLine().trim();

			if (scelta.equalsIgnoreCase("esc")) {
				running = false;
				System.out.println("Programma terminato.");
				continue;
			}
			boolean inputCorretto = false;
			while (!inputCorretto) {
				try {
					switch (scelta) {
					case "1" -> util.inserisciContatto(sc, rubrica);
					case "2" -> util.aggiornaContatto(sc, rubrica);
					case "3" -> util.aggiornaContattoParziale(sc, rubrica);
					case "4" -> util.cancellaContatto(sc, rubrica);
					case "5" -> util.cancellaContattoByNumero(sc, rubrica);
					case "6" -> util.ricercaContattoPerNome(sc, rubrica);
					case "7" -> util.ricercaContattoPerCognome(sc, rubrica);
					case "8" -> util.ricercaContattoPerNumeroDiTelefono(sc, rubrica);
					case "9" -> util.visualizzaContatti(rubrica);
					case "10" -> util.visualizzaContattiOrdinatiPerNome(rubrica);
					case "11" -> util.visualizzaContattiOrdinatiPerCognome(rubrica);
					case "12" -> util.visualizzaContattiOrdinatiPerCognomeNome(rubrica);
					default -> {
						System.out.println("Opzione non valida, riprova.");
						break;
						}
					}
					inputCorretto = true;
				} catch (ContattoEsistenteException e) {
					System.out.println(e.getMessage());
					inputCorretto = true;
				} catch (IllegalArgumentException e) {
					System.out.println("Input non valido: " + e.getMessage());
					System.out.println("Scegli un opzione valida: ");
				} catch (Exception e) {
					System.out.println("Si è verificato un errore imprevisto: " + e.getMessage());
					inputCorretto = true;
				}
			}
		}
		sc.close();
	}
}

