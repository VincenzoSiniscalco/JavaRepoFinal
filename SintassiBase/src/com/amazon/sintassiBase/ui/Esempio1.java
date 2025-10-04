package com.amazon.sintassiBase.ui;
import java.util.Scanner;

public class Esempio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserire un nome: ");
		
		String nome = sc.nextLine();
		
		System.out.println("Benvenuto " + nome);
		
		
		sc.close();
	}

}
