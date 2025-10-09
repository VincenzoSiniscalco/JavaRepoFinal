package com.azienda.utilityjdk.esempio1.ui;

import java.util.Scanner;

public class TestInteger {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int primitivo= 10;
			Integer oggetto= primitivo;
			oggetto=11;
			Integer oggetto2= 10;
			primitivo = oggetto;
			test(primitivo);
			primitivo = getNumber(sc);
			System.out.println(primitivo);
			System.out.println("Programma terminato");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void test(Integer x) {
		System.out.println(x);
	}
	private static int getNumber(Scanner sc) {
		while(true) {
			System.out.println("Inserire un numero: ");
			String x= sc.nextLine();
			try {
				return Integer.parseInt(x);
			} catch (Exception e) {
				System.out.println("Devi inserire un numero!");
			} 
		}
	}

}
