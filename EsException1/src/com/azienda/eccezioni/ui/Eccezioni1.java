package com.azienda.eccezioni.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.azienda.eccezioni.exception.NegativeNumberException;
import com.azienda.eccezioni.exception.NumberIsZeroException;
import com.azienda.eccezioni.utilities.NumberValidator;

public class Eccezioni1 {
	public static void main(String[] args) {
		
		try (Scanner sc= new Scanner(System.in)){
			
			System.out.println("Inserisci un numero intero: ");
			int num= leggiNumero(sc);
			sc.nextLine();
			NumberValidator.check(num);
			
			System.out.println("Inserisci un secondo numero intero: ");
			int num2= leggiNumero(sc);
			sc.nextLine();
			NumberValidator.check(num2);
			
			System.out.println(num + " / " + num2 + " = " + num/num2);
			
			
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (NumberIsZeroException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Errore inaspettato.");
			e.printStackTrace();
		}
		
		
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
