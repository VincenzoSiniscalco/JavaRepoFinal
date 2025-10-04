package it.itconsulting.esercizi.ui;
import java.util.Random;
import java.util.Scanner;


public class TestIndovina {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int scelta;
		do {
		int numIndovina =controlla(sc);
		
		System.out.println("Inserire un numero: ");
		int num=sc.nextInt();
		
		
		if(num==numIndovina) {
			System.out.println("Hai indovinato!");
		}else {
			System.out.println("Hai sbagliato, il numero da indovinare era : " + numIndovina);
		}
		
		System.out.println("Se vuoi continuare inserisci un numero diverso da zero.");
		scelta=sc.nextInt();
		
		}while (scelta!=0);
		System.out.println("Programma terminato.");
		
		
		sc.close();
	}
	
	
	
	static int controlla(Scanner sc) {
		
		System.out.println("Inserire un valore per generare il range del numero da indovinare:");
		
		int num =sc.nextInt();
		int valore= new Random().nextInt(num);
		
		return valore;
	}
}
