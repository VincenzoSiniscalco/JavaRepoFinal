package it.itconsulting.esercizi.ui;

import java.util.Scanner;

public class Operatori6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Inserisci un numero intero: ");
		int ris=sc.nextInt();
		int num=ris;
		ris+=10;
		
		System.out.println("Incrementando "+num+" di 10 si ottiene "+ris);
		
		sc.close();
	}

}
