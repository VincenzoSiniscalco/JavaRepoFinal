package it.itconsulting.esercizi.ui;

import java.util.Scanner;

public class TestDivisione2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int scelta;
		do {
			System.out.println("Inserire il primo numero");
			double x = scanner.nextDouble();
			System.out.println("Inserire il secondo numero");
			double y = scanner.nextDouble();
			divisione(x,y);
			System.out.println("Per terminare premere 0, per proseguire premere qualsiasi altro numero");
			scelta = scanner.nextInt();
		}while(scelta!=0);
		System.out.println("Programma terminato");
		scanner.close();
	}
	
	private static void divisione(double a,double b) {
		if( b==0 ) {
			System.out.println("Non si può fare la divisione per zero");
		}
		else {
			System.out.println(a + "/" + b + " = " + a/b);
		}
	}

}
