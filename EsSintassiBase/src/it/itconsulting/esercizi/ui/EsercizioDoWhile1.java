package it.itconsulting.esercizi.ui;

import java.util.Scanner;

public class EsercizioDoWhile1 {
	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	 int num;
	do {
		 System.out.println("Immetti un numero maggiore o uguale a zero:");
		 num= sc.nextInt();
	 }while(num<=0);
	 int i=0;
	do {
		System.out.println("Numero: "+ i);
	    i++;
	}while(i<num);
	
	sc.close();
}

}