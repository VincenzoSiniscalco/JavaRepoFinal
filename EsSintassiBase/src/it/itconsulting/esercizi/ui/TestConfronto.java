package it.itconsulting.esercizi.ui;

import java.util.Scanner;

public class TestConfronto {

	public static void main(String[] args) {
		int scelta;
		Scanner sc= new Scanner(System.in);
	do {	
		System.out.println("Inserire il primo numero intero: ");
		int num1=sc.nextInt();
		System.out.println("Inserire il secondonumero intero: ");
		int num2=sc.nextInt();
		
		int res=confronta(num1,num2);
		
		switch(res) {
		case -1:{
			System.out.println("Il primo numero è minore del secondo.");
			break;
		}
		case 0:{
			System.out.println("I due numeri sono uguali.");
			break;
		}
		case 1:{
			System.out.println("Il primo numero è maggiore rispetto al secondo.");
			break;
		}
		default:{
			System.err.println("Formato dei dati non corretto.");
		}
		}
		System.out.println("Se si vuole continuare digitare un numero diverso da 0.");
		scelta= sc.nextInt();
	}while(scelta!=0);
		
		sc.close();
	}

	static int confronta(int a,int b) {
		
		if(a<b) {
			return -1;
		}
		if(a==b){
			return 0;
		}
		return 1;
	}
	
}
