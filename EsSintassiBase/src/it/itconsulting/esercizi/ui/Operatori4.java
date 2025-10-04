package it.itconsulting.esercizi.ui;

import java.util.Scanner;

public class Operatori4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Inserire il primo numero intero: ");
		int a= sc.nextInt();
		
		System.out.println("Inserire il secondo numero intero: ");
		int b=sc.nextInt();
		
		String s = (a>=b)? "a maggiore o uguale di b" : "b maggiore di a";
		System.out.println(s);
		
		sc.close();
	}

}
