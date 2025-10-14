package com.azienda.utilitaJdk.parteA.esercizi;

import java.util.Scanner;

public class EsercizioArray2 {

	public static void main(String[] args) {
		try (Scanner sc= new Scanner(System.in)){
			int dim =getIntero(sc);
			Integer [][] matrice= new Integer[dim][dim];
			riempiArray2(matrice);
			stampaArray(matrice);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static int getIntero(Scanner sc) throws Exception {
		int num;
		do{
			System.out.println("Inserisci un numero intero positivo e maggiore di zero: ");
			while(!sc.hasNextInt()) {
				System.out.println("Valore non valido. Per favore inserire un numero positivo maggiore di zero");
				sc.nextLine();
			}
			num= sc.nextInt();
			if(num<=0) {
				System.out.println("Il numero dev'essere positivo e maggiore di zero!");
				}
				
		}while(num<=0);
		return num;
		
	}
	private static void riempiArray2(Integer [][] matrice) {
		for(int i=0;i<matrice.length;i++) {
			for(int j=0;j<matrice[i].length;j++) {
				if(i==j||i+j==matrice[i].length-1) {
					matrice[i][j]=1;
				}else {
					matrice[i][j]=0;
				}
			}
		}
	}
	private static void stampaArray(Integer[][] matrice) {
		for(Integer[] vettore:matrice) {
			for(Integer num:vettore) {
				System.out.print(num+ "\t");
			}
			System.out.println();
		}
	}
}
