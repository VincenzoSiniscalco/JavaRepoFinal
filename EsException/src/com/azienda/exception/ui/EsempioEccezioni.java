package com.azienda.exception.ui;

import java.util.Scanner;

public class EsempioEccezioni {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc= new Scanner(System.in);
			int x =4;
			int y =0;
			int z=x/y;
			System.out.println(z);
		}catch(Exception ex){
			System.out.println("Problema");
			int a=1/0;
			ex.printStackTrace();
		}finally {
			sc.close();
		}
		
		System.out.println("Programma terminato.");
	}

}
