package com.azienda.utilitaJdk.parteA.esercizi;

import java.util.Scanner;

public class EsercizioArray {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
			System.out.println("Digitare la dimensione dell'array: ");
			int dim= sc.nextInt();
			sc.nextLine();
			Integer[] i= new Integer[dim];
			riempiArray(i);
			stampaArray(i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void riempiArray(Integer[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]=i*i;
		}
	}
	private static void stampaArray(Integer[] array) {
		for(Integer num:array) {
			System.out.println(num);
		}
	}
}
