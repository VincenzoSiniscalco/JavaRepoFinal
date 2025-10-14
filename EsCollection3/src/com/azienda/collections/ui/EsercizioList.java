package com.azienda.collections.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EsercizioList {
	public static void main(String[] args) {
		final String uscita="ESC";
		String scelta= null;
		List<String> lista = new ArrayList<String>();;
		String s=null;
		Scanner sc= new Scanner(System.in);
		try{
			do {
				try {
					System.out.println("Inserisci una stringa: ");
					s= leggiStringa(sc);
					lista.add(s);
					System.out.println("Digitare \"ESC\" se si vuole uscire dal programma.");
					scelta=leggiStringa(sc);
				
				} catch (NoSuchElementException e) {
					e.getMessage();
					e.printStackTrace();
					}catch (Exception e) {
						e.printStackTrace();
					}
			} while(!scelta.equals(uscita));
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			printList(lista);
			printList2(lista);
			printList3(lista);
			trova(lista,sc);
			List<String> resStampa2= trovaIniziale(lista,sc);
			printList(resStampa2);
		}catch(NoSuchElementException e) {
			e.getMessage();
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static String leggiStringa(Scanner sc) {
		String s= sc.nextLine();
		if(s.isBlank()||s.equals("")) {
			throw new NoSuchElementException("Stringa vuota!");
		}return s;
	}
	
	
	private static void printList(List<String> lista) {
		for(int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
	}


	private static void printList2(List<String> lista) {
		for(String s:lista) {
			System.out.println(s);
		}
	}

	private static void printList3(List<String> lista) {
		Iterator<String> it= lista.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
	}
	private static void trova(List<String> lista,Scanner sc) throws Exception {
		System.out.println("Che stringa vuoi cercare?");
		String s= sc.nextLine();
		if(lista.size()==0) {
			throw new Exception("La lista è vuota!");
		}
		if(s.isBlank()) {
			throw new Exception("Non hai inserito una stringa!");
		}
		if(lista.contains(s)) {
			System.out.println("L'elemento "+ s + " è presente nella lista all'indice "+ lista.indexOf(s));
		}else {
			System.out.println("L'elemento non è presente nella lista.");
		}
	}

	private static List<String> trovaIniziale(List<String> lista,Scanner sc) throws Exception {
		System.out.println("Ricerca per iniziale: quale lettera ti interessa?");
		String init= sc.nextLine();

		char iniziale;
		if(init.isBlank()) {
			throw new NoSuchElementException("Non hai inserito una stringa!");
		}else {
			iniziale=init.charAt(0);
		}

		List<String> risultato = new ArrayList<>();

		if(lista.size()==0) {
			throw new Exception("La lista è vuota!");
		}else {
			for(String parola:lista) {

				if(parola.toLowerCase().charAt(0)==iniziale){
					risultato.add(parola);
				}
			}

			return risultato;	
		}
	}
}
