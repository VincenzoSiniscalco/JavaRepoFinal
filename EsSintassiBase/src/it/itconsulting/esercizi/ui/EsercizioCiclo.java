package it.itconsulting.esercizi.ui;

import java.util.Scanner;

public class EsercizioCiclo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num1;
		do {
			 System.out.println("Si deve inputare un numero maggiore di zero:");
			 num1= sc.nextInt();
		 }while(num1<=0);
		
		int num2;
		do {
			 System.out.println("Si deve inputare un numero maggiore di zero e minore di "+num1);
			 num2= sc.nextInt();
			 
		 }while(num2<=0 || num2>=num1);
		
		for(int i=0;i<num1;i++) {
			if(i==num2) {
				continue;
			}
			System.out.println("Numero con passo i: "+i);
			
		}
		sc.close();
		
	}

}
