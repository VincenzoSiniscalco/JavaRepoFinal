package it.itconsulting.esercizi.ui;

import java.util.Scanner;

public class Operatori3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Inserire un numero intero: ");
		int a= sc.nextInt();
		System.out.println("Stampo a schermo il numero con post-incremento: prima stampo e poi incremento il numero " + a++);
		System.out.println("Stampo a schermo il numero dopo il post-incremento: il numero è ora incrementato " + a);
		System.out.println("Stampo a schermo il numero con pre-incremento: prima incremento e poi stampo a schermo " + ++a);
		System.out.println("Stampo a schermo il numero dopo il pre-incremento:il numero rimane identico "+a);
	
	
		sc.close();

	}

}
