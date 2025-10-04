package it.itconsulting.esercizi.ui;

import java.util.Scanner;

public class EsercizioIf {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Inserire il primo numero:");
		int x=sc.nextInt();
		
		System.out.println("Inserire il secondo numero:");
		int y=sc.nextInt();
		
		if(y==0) {
			System.out.println("Non si può dividere per zero.");
		}else if(x>0 && y>0 && y<=x) {
			System.out.println("La divisione ha come risultato "+ x/y);
		}
		System.out.println("Programma terminato.");
	
		sc.close();
	}

}
