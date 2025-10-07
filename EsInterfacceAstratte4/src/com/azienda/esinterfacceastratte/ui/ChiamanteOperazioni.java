package com.azienda.esinterfacceastratte.ui;


import java.util.Scanner;

import com.azienda.esinterfacceastratte.model.Differenza;
import com.azienda.esinterfacceastratte.model.Divisione;
import com.azienda.esinterfacceastratte.model.OperazioniAritmetiche;
import com.azienda.esinterfacceastratte.model.Prodotto;
import com.azienda.esinterfacceastratte.model.Somma;

public class ChiamanteOperazioni {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int scelta,op1,op2;
		do {
		System.out.println("Effettua una scelta:");
		System.out.println("1=somma");
		System.out.println("2=differenza");
		System.out.println("3=prodotto");
		System.out.println("4=divisione");
		System.out.println("5=esci");
		scelta= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Inserisci il primo operando: ");
		op1=sc.nextInt();
		sc.nextLine();
		System.out.println("Inserisci il secondo operando: ");
		op2=sc.nextInt();
		sc.nextLine();
		OperazioniAritmetiche object= null;
		switch(scelta) {
		case 1:
			object= new Somma();
			break;
		case 2:
			object= new Differenza();
			break;
		case 3:
			object= new Prodotto();
			break;
		case 4:
			object= new Divisione();
			break;
		}
		
		
		object.printResult(object.operate(op1, op2));
		
		System.out.println("Se si vuole uscire dal programma, digitare 5: ");
		System.out.println("5=esci");
		scelta= sc.nextInt();
		sc.nextLine();
		}while(scelta!=5);
		sc.close();
	}

}
