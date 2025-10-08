package com.azienda.eccezioni.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.azienda.eccezioni.exception.NegativeNumberException;
import com.azienda.eccezioni.exception.NumberIsZeroException;
import com.azienda.eccezioni.utilities.Controller;

public class ChiamanteCustom {

	public static void main(String[] args) {
		int scelta = 0;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Procedere con la divisione?");
			System.out.println("1= Si");
			System.out.println("2= No");
		try {
			
			scelta = sc.nextInt();
			sc.nextLine();
			int num1 = 0,num2 = 0;
			
			switch(scelta) {
			case 1:{

				System.out.println("Inserire il primo numero intero: ");
				num1 = leggiNumero(sc);
				sc.nextLine();
				Controller.checkPositive(num1);

				System.out.println("Inserire il secondo numero intero: ");
				num2 = leggiNumero(sc);
				sc.nextLine();
				Controller.checkNotZero(num2);

				break;
			}case 2:{
				System.out.println("Programma terminato.");
				break;
			}

			}
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (NumberIsZeroException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Errore di formato.");
			e.printStackTrace();
		}
		}while(scelta!=2);
		sc.close();
	}
	private static int leggiNumero(Scanner sc) {
		while(true) {
			try {
				return sc.nextInt();

			}catch(InputMismatchException e) {
				System.out.println("Input non valido. Inserisci un numero intero: ");
				sc.nextLine();
			}
		}
	}
}
