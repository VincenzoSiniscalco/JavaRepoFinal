package it.itconsulting.ClassObject.ui;

import java.util.Scanner;

import it.itconsulting.ClassObject.model.Libro;

public class TestLibro {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int scelta = 0;
		do {		
		Libro l= creaLibro(sc);
		l.stampaInfo();
		
		incrementaPrezzo(l,sc);
		
		l.stampaInfo();
		
		System.out.println("Se si vuole continuare ad usare il programma, digitare un numero diverso da zero.");
		scelta= sc.nextInt();
		}while(scelta!=0);
		System.out.println("Programma terminato.");
		sc.close();
	}
	public static Libro creaLibro(Scanner sc) { //costruttore per parametri da console
		System.out.println("Inserire le caratteristiche del libro(titolo, autore, prezzo, numero pagine): ");
		if(sc!=null) {
			String titolo= sc.nextLine();
			String autore= sc.nextLine();
			float prezzo= sc.nextFloat();
			int numeroPagine= sc.nextInt();
			return new Libro(titolo,autore,prezzo,numeroPagine);
			}else {
			return null;
		}
	}
	public static void incrementaPrezzo(Libro libro, Scanner sc) {
		System.out.println("Immettere l'aumento di prezzo da applicare al libro "+ libro.getTitolo());
		float incremento=sc.nextFloat();
		if(incremento<=0) {
			System.err.println("Errore di formato!"); 
		}else {
			 libro.incrementaPrezzo(incremento);
		}
	}

}
