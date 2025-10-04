package it.itconsulting.esercizi.ui;

import java.util.Scanner;

public class Operatori5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Inserire il primo valore booleano (true/false): ");
		boolean bool1= sc.nextBoolean();
		
		System.out.println("Inserire il secondo valore booleano (true/false): ");
		boolean bool2= sc.nextBoolean();
		
		System.out.println(bool1&&bool2);
		System.out.println(bool1||bool2);
		System.out.println(!bool1);
		System.out.println(!bool2);
		
		
		sc.close();
	}

}
