package it.itconsulting.esercizi.ui;
import java.util.Scanner;

public class Operatori2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Inserire il primo numero intero: ");
		int a= sc.nextInt();
		
		System.out.println("Inserire il primo numero intero: ");
		int b= sc.nextInt();
		
		int res= a+b;
		System.out.println("La somma dei due numeri fa: "+ res);
		
		
		sc.close();
	}

}
