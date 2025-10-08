package com.azienda.exception.ui;

import java.util.Scanner;

public class EsempioEccezioni2 {
	public static void main(String[] args) {

		try(Scanner sc=new Scanner(System.in)) {
			int x =4;
			int y =0;
			int z=x/y;
			System.out.println(z);
		}catch(Exception ex){
			System.out.println("Problema");
			int a=1/0;
			ex.printStackTrace();
		}
		System.out.println("Programma terminato.");
	}
}

