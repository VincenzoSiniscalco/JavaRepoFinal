package com.azienda.riepilogo.ui;

import java.util.Scanner;

import com.azienda.riepilogo.exception.IsBooleanException;
import com.azienda.riepilogo.exception.IsFloatException;
import com.azienda.riepilogo.exception.VeicoloNonValidoException;
import com.azienda.riepilogo.model.Aereo;
import com.azienda.riepilogo.model.Treno;
import com.azienda.riepilogo.model.Veicolo;
import com.azienda.riepilogo.model.VeicoloFactory;
import com.azienda.riepilogo.utilities.FloatValidator;

public class TestVeicolo {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        VeicoloFactory factory = new VeicoloFactory();

	        while (true) {
	            try {
	                System.out.println("Digita il tipo di veicolo da creare (Aereo / Treno) oppure ESC per uscire:");
	                String input = sc.nextLine();

	                if (input.equalsIgnoreCase("ESC")) {
	                    System.out.println("Chiusura programma...");
	                    break;
	                }

	                // Creazione del veicolo
	                Veicolo v = factory.creaVeicolo(input, sc);

	                // Inserimento distanza
	                System.out.println("Inserisci la distanza da percorrere (in km):");
	                float distanza = FloatValidator.checkFloat(sc.nextLine());

	                // Calcolo tempo
	                float tempo = v.calcolaTempiPercorrenza(v, distanza);
	                System.out.printf("Tempo di percorrenza stimato: %.2f ore%n", tempo);

	                // Informazioni movimento
	                v.informazioniMovimento(v);

	                if (v instanceof Aereo) {
	                    ((Aereo) v).vola();
	                } else if (v instanceof Treno) {
	                    ((Treno) v).percorreBinari();
	                }

	            } catch (VeicoloNonValidoException e) {
	                System.err.println(e.getMessage());
	                e.printStackTrace();
	            } catch (IsFloatException e) {
	                System.err.println("Valore numerico non valido: " + e.getMessage());
	                e.printStackTrace();
	            } catch (IsBooleanException e) {
	                System.err.println("Valore booleano non valido: " + e.getMessage());
	                e.printStackTrace();
	            } catch (Exception e) {
	                System.err.println("Errore imprevisto: " + e.getMessage());
	                e.printStackTrace();
	            }

	          
	        }

	        sc.close();
	    }
	}
