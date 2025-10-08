package com.azienda.exception2.ui;

import com.azienda.exception2.model.Divisione;

public class TestEccezioni {
	public static void main(String[] args) {
		try {
			int x=Divisione.divisioneChecked(4, 2);
			System.out.println(x);
			try {
			x=Divisione.divisioneChecked(4, 0);
			System.out.println(x);
			}catch (Exception e) {
				System.out.println("errore previsto");
			}
			try{
				x=Divisione.divisioneUnchecked(2, 0);
				System.out.println(x);
			}catch (Exception e) {
				System.out.println("errore previsto");
			}
			try{
				x=Divisione.divisioneChecked2(2, 0);
				System.out.println(x);
			}catch (Exception e) {
				System.out.println("errore previsto, messaggio: " + e.getMessage());
				e.printStackTrace();
			}
			try{
				x=Divisione.divisioneChecked3(2, 0);
				System.out.println(x);
			}catch (ArithmeticException | NullPointerException e) {
				System.out.println("errore previsto, messaggio: " + e.getMessage() + e.getCause());
				e.printStackTrace();
			}catch (Exception e) {
				System.out.println("errore previsto, messaggio: " + e.getMessage() + e.getCause());
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Programma terminato.");
	}
}
