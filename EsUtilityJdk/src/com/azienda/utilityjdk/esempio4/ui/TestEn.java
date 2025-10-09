package com.azienda.utilityjdk.esempio4.ui;

import com.azienda.utilityjdk.esempio4.model.Abito;
import com.azienda.utilityjdk.esempio4.model.Stagione;

public class TestEn {

	public static void main(String[] args) {
		try {
			Stagione stagione= Stagione.AUTUNNO;
			Abito a= new Abito("Giacca",stagione);
			System.out.println(stagione);
			System.out.println(stagione.ordinal());
			System.out.println(a);
			
			String nome="gonna";
			String st="ESTATE";
			Stagione s2= Stagione.valueOf(st);
			Abito a2= new Abito(nome,s2);
			System.out.println(a2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
