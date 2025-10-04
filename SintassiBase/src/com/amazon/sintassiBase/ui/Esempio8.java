package com.amazon.sintassiBase.ui;

public class Esempio8 {

	public static void main(String[] args) {
		
		metodo1();
		
		metodo2("Carlo");
		
		String nome= "Anna";
		metodo2(nome);
		
		String x= metodo3("Mario","Rossi");
		System.out.println(x);
		
		System.out.println(metodo3("Anna","Verdi"));
		
		x= metodo4("Claudia","Bianchi");
		System.out.println(x);
		
		System.out.println("Programma terminato.");
	}

	static void metodo1() {
		System.out.println("Metodo 1.");
	}
	static void metodo2(String a) {
		System.out.println("Benvenuto "+a);
	}
	
	static String metodo3(String n, String c) {
		String s= "Benvenuto "+ n + " " + c;
		return s;
	}
	static String metodo4(String name, String surname) {
		String s= metodo3(name,surname);
		return s+" come stai?";
	}
	
}
