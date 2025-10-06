package com.azienda.ereditarieta.ui;

import com.azienda.ereditarieta.model.Macchina;
import com.azienda.ereditarieta.model.OverrideEquals;
import com.azienda.ereditarieta.model.Persona;

public class TestOverrideEquals {
	public static void main(String[] args) {
		OverrideEquals obj= new OverrideEquals("Anna",24);
		OverrideEquals obj2= new OverrideEquals("Anna",24);
		
		if(obj==obj2) {
			System.out.println("Sono uguali");
		}else {
			System.out.println("Sono diversi");
		}
		
		if(obj.equals(obj2)) {
			System.out.println("Sono uguali");
		}else {
			System.out.println("Sono diversi");
		}
		
		Persona p1= new Persona("Anna","Verdi");
		Persona p2= new Persona("Anna","Verdi");
		Macchina m1= new Macchina("m1",p1);
		Macchina m2= new Macchina("m1",p2);
		
		if(m1.equals(m2)) {
			System.out.println("Le macchine sono uguali");
		}else {
			System.out.println("Le macchine sono diverse");
		}
		
	}
}
