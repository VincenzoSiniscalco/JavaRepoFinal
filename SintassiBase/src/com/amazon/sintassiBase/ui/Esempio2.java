package com.amazon.sintassiBase.ui;

import java.util.Scanner;

public class Esempio2 {
	public static void main(String[] args) {
		
		System.out.println("Inserire un numero: ");
		
		Scanner sc= new Scanner(System.in);
		
		int numero= sc.nextInt();
		
		System.out.println("Il numero è: " + numero);
		
		sc.close();
	}
}
