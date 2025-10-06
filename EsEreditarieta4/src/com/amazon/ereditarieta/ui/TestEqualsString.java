package com.amazon.ereditarieta.ui;

public class TestEqualsString {

	public static void main(String[] args) {
		String s1="Ciao";
		String s2="Ciao";
		//s1="Ciao2";
		if(s1==s2) {
			System.out.println("Sono uguali");
		}else {
			System.out.println("Sono diversi");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Sono uguali");
		}else {
			System.out.println("Sono diversi");
		}
		
		String s3= new String("Ciao");
		String s4= new String("Ciao");
		
		if(s3==s4) {
			System.out.println("Sono uguali");
		}else {
			System.out.println("Sono diversi");
		}
		
		if(s3.equals(s4)) {
			System.out.println("Sono uguali");
		}else {
			System.out.println("Sono diversi");
		}
		
		System.out.println("Programma terminato");

	}

}
