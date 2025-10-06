package com.azienda.classiAvanzate.parteB.esercizi.a;

public class MainC {

	public static void main(String[] args) {
		A object = new A("ciao", 5);
		System.out.println(object);
		
		A object2 = new A("ciao", 5);
		System.out.println(object.equals(object2)? "Gli oggetti sono uguali" : "Gli oggetti sono diversi"); 
		
		object= new B("Mario",6, 8.5f);
		System.out.println(object);
		
		System.out.println(object.getS());
		
		object.setS("Franco");
		System.out.println(object.getS());
		
		System.out.println(((B)object).getParentS());
		
	}

}
