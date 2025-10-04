package it.itconsulting.ClassObject.ui;

import java.util.Scanner;

import it.itconsulting.ClassObject.model.Automobile;
import it.itconsulting.ClassObject.model.Fabbrica;
import it.itconsulting.ClassObject.model.Indirizzo;

public class ChiamanteAutomobile {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

	
			Indirizzo i= creaIndirizzo(sc);

			Fabbrica f=creaFabbrica(sc,i);

			Automobile a=creaAutomobile(sc,f,i);

			System.out.println(a.infoAutomobile());
			System.out.println("La fabbrica ha prodotto "+f.getAutoProdotte()+ " auto." );

		
		sc.close();
	}

	private static Automobile creaAutomobile(Scanner sc,Fabbrica f,Indirizzo i) {

		System.out.println("Introdurre il nome del modello dell'auto: ");
		String modello=sc.nextLine();
		System.out.println("Specificare la marca: ");
		String marca=sc.nextLine();
		System.out.println("Dichiarare la targa: ");
		String targa=sc.nextLine();
		System.out.println("Specificare la cilindrata ");
		int cilindrata=sc.nextInt();
		System.out.println("Qual'è la fabbrica di provenienza?:");

		return new Automobile(modello,marca,targa,cilindrata,f);
	}

	private static Fabbrica creaFabbrica(Scanner sc,Indirizzo i) {
		System.out.println("Dichiarare il nome della fabbrica:");
		String nome=sc.nextLine();

		return new Fabbrica(nome, i);
	}

	private static Indirizzo creaIndirizzo(Scanner sc) {
		System.out.println("Specifica l'indirizzo: ");
		System.out.println("Inserisci la nazione: ");
		String nazione=sc.nextLine();
		System.out.println("Inserisci la citta: ");
		String citta=sc.nextLine();
		System.out.println("Inserisci la via: ");
		String strada=sc.nextLine();
		System.out.println("Inserisci il cap: ");
		int cap= sc.nextInt();
		sc.nextLine();
		return new Indirizzo(nazione,citta,strada,cap);
	}




}
