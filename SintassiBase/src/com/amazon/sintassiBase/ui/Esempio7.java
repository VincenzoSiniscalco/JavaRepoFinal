package com.amazon.sintassiBase.ui;

import java.util.Scanner;

public class Esempio7 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int giorni =-1;
		boolean errore=false;
		
		System.out.println("Inserire il mese (Gennaio,...,Dicembre)");
		String mese=sc.nextLine();
		
		switch(mese) {
		case "Gennaio" : case "Marzo": case "Maggio": case "Luglio" : 
		case "Agosto" : case "Ottobre" : case "Dicembre" :{
			giorni=31;
			break;
		}
		case "Aprile":case "Giugno":case"Settembre":case"Novembre":{
			giorni=30;
			break;
		}
		case "Febbraio":{
			System.out.println("Anno bisestile? (true/false)");
			boolean bisestile = sc.nextBoolean();
			if(!bisestile) {
				giorni=28;
			}else {
				giorni=29;
			}break;
		}default:{
			errore=true;
			System.out.println("Mese non valido.");
		}
			
		}
		
		
		sc.close();
		
		if(!errore) {
			System.out.println("Il mese di "+mese+" ha "+giorni+" giorni.");
		}
	}

}
