package com.azienda.interfacceastratte.ui;

import com.azienda.interfacceastratte.model.Astratta;
import com.azienda.interfacceastratte.model.Concreta1;
import com.azienda.interfacceastratte.model.Concreta2;

public class TestAstratte {

	public static void main(String[] args) {
		Astratta ref = new Concreta1();
		ref.metodoConcreto();
		ref.metodoAstratto();
		
		((Concreta1)ref).specifico1();
		
		ref= new Concreta2();
		ref.metodoConcreto();
		ref.metodoAstratto();
		((Concreta2)ref).specifico2();
		
		System.out.println("Programma terminato.");
	}
	private static void metodo1(Astratta obj) {
		obj.metodoConcreto();
		obj.metodoAstratto();
	}
	
	private static void metodo2(Concreta1 obj) {//SBAGLIATO CONCETTUALMENTE
		obj.metodoConcreto();
		obj.metodoAstratto();
	}
	
	private static void metodo3(Astratta obj) {
		obj.metodoConcreto();
		obj.metodoAstratto();
		if(obj instanceof Concreta1) {
			((Concreta1)obj).specifico1();
		}
	}
	private static void metodo4(Concreta1 obj) {
		obj.metodoConcreto();
		obj.metodoAstratto();
		obj.specifico1();
	}
	
	
}
