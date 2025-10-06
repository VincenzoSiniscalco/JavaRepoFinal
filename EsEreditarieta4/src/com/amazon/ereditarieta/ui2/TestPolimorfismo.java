package com.amazon.ereditarieta.ui2;

import com.amazon.ereditarieta.model.Child;
import com.amazon.ereditarieta.model.Parent;

public class TestPolimorfismo {

	public static void main(String[] args) {
		
		Parent p= new Parent();
		
		p.setStringa1("s1");
		p.setStringa2("s2");
		p.setStringa3("s3");
		if(p instanceof Child) {
			Child c2= (Child) p;
		}
		
		p= new Child();
		
		p.setStringa1("c1");
		p.setStringa2("c2");
		p.setStringa3("c3");
		
		Child c= (Child) p;
		c.setStringa4("c4");
		c.setParentStringa3("cp3");
		
		((Child)p).setParentStringa3("cp3");
		
		metodo(new Parent());
		metodo(new Child());
		
		metodo1(new Parent());
		metodo1(new Child());
		//metodo2(new Parent());
		metodo2(new Child());
		
		System.out.println("Programma terminato.");
	}
	
	private static void metodo(Parent ref) {
		ref.setStringa1("c1");
		ref.setStringa2("c2");
		ref.setStringa3("c3");
		if(ref instanceof Child) {
			Child c= (Child) ref;
			c.setStringa4("c4");
			//c.setParentStringa3("cp3");
			
			((Child)ref).setParentStringa3("cp3");
		}
		
	}
	// Caso 1: due metodi che usano le parti comuni
	
	private static void metodo1(Parent ref) {
		ref.setStringa1("c1");
		ref.setStringa2("c2");
		ref.setStringa3("c3");
		}
	
	private static void metodo2(Child ref) {
		ref.setStringa1("c1");
		ref.setStringa2("c2");
		ref.setStringa3("c3");
		}
	//Caso 2: due metodi che lavorano anche sulle parti specifiche
	
	private static void metodo3(Parent ref) {
		ref.setStringa1("c1");
		ref.setStringa2("c2");
		ref.setStringa3("c3");
		if(ref instanceof Child) {
			Child c= (Child) ref;
			c.setStringa4("c4");
			//c.setParentStringa3("cp3");
			
			((Child)ref).setParentStringa3("cp3");
		}
		
	}
	
	private static void metodo4(Child ref) {
		ref.setStringa1("c1");
		ref.setStringa2("c2");
		ref.setStringa3("c3");
			
			ref.setStringa4("c4");
			//c.setParentStringa3("cp3");
			
			ref.setParentStringa3("cp3");
		}
		
	}


