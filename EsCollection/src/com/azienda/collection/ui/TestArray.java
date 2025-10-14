package com.azienda.collection.ui;

import com.azienda.collection.model.Persona;

public class TestArray {

	public static void main(String[] args) {
		try {
			int[] numeri= new int[5];
			Integer[] numeri2= new Integer[5];
			String[] nomi= {"Mario","Giovanna","Luca","Anna"};

			System.out.println(nomi[1]);
			nomi[2]="Franco";
			System.out.println(nomi[3].toUpperCase());
			try {
				System.out.println(nomi[5]);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Persona[] persone= new Persona[3];
			try {
				persone[0].setNome("Luigi");
			} catch (Exception e) {
				e.printStackTrace();
			}
			persone[0]= new Persona("Luigi","Rossi");
			System.out.println(persone[0].getNome());
			System.out.println(persone[0]);

			Persona[] persone2= {new Persona("Eva","Bianchi"),
					new Persona("Andrea","Verdi"),
					new Persona("Luigi","Rossi")};

			persone2[0].setNome("Claudia");

			for(int i=0;i<nomi.length;i++) {
				System.out.println(nomi[i]);
			}
			
			for(String n:nomi) {
				System.out.println(n);
			}
			
			for(int i=0;i<persone2.length;i++) {
				System.out.println(persone2[i].getNome().toUpperCase());
			}

			for(Persona p: persone2) {
				System.out.println(p.getCognome().toUpperCase());
			}
			
			String [][] nomi2= new String [3][2];
			nomi2[1][1] ="Gianni";
			nomi2[0][1]="Luisa";
			nomi2[2][0]="Andrea";
			
			for(int i=0;i<nomi2.length;i++) {
				for(int j = 0;j<nomi2[i].length;j++) {
					System.out.print(nomi2[i][j]+ " ");
				}
				System.out.println();
			}
			
			String [][] nomi3= {
					{"Carlo","Anna"},
					{"Mario","Eva"},
					{"Andrea","Claudio"}
			};
			
			for(String[] riga: nomi3) {
				for(String n:riga) {
					System.out.print(n+" ");
				}
				System.out.println();
			}
			
			System.out.println("programma terminato");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
