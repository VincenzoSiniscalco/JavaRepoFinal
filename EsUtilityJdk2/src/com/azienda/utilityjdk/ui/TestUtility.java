package com.azienda.utilityjdk.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.azienda.utilityjdk.exceptions.StringLenghtException;
import com.azienda.utilityjdk.utils.StringValidator;

public class TestUtility {
	public static void main(String[] args) {
		String scelta = null;
		do {
		try (Scanner sc= new Scanner(System.in)){
			String s = null;
			try {
			
			s=leggiStringa(sc,s);
			StringValidator.check(s);
			}catch(StringLenghtException e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
			String subString= s.substring(4, 8);
			System.out.println("La sottostringa dal quinto all'ottavo carattere è: "+subString);
			System.out.println("Il secondo ed il tezo carattere, in maiuscolo, sono: "+s.toUpperCase().substring(1,3));
			boolean b= subString.contains("r");
			if(b) {
				System.out.println("erat contiene la r in posizione "+ subString.indexOf("r"));
			}
			System.out.println("Digitare \"ESC\" se si vuole uscire dal ciclo.");
			scelta=sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}while(!scelta.equals("ESC"));
	}
	public static String leggiStringa(Scanner sc,String s) {
		while(true) {
			System.out.println("Inserire una stringa: ");
			s=sc.nextLine();
			try {
				return s;
			} catch (InputMismatchException e) {
				System.out.println("Errore di formato! "+s+"Non è una stringa.");
			}
		}
	}
}
