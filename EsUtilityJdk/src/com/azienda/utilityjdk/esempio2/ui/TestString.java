package com.azienda.utilityjdk.esempio2.ui;

public class TestString {

	public static void main(String[] args) {
		try {
			String s= "Ciao";
			int len= s.length();
			char c= s.charAt(0);
			try {
				c=s.charAt(5);
			} catch (Exception e) {
				System.out.println("Errore!");
			}
			for(int i=0;i<s.length();i++) {
				System.out.println(s.charAt(i));
			}
			int pos= s.indexOf("C");
			pos= s.indexOf("c");
			pos="dado".lastIndexOf("d");
			boolean b = "Bianco".equals("bianco");
			b = "Bianco".equalsIgnoreCase("bianco");
			b=s.contains("Cia");
			b=s.contains("cia");
			b=s.startsWith("Ci");
			b=s.startsWith("ci");
			String s2=s.toUpperCase();
			String s3=s.toLowerCase();
			String s4="Mario".substring(2);
			try {
				s4="Mario".substring(6);
			} catch (Exception e) {
				System.out.println("Errore");
			}
			s4="Mario".substring(1, 4);
			String s5="      Ciao come va?      ";
			String s6=s5.trim();
			System.out.println("Programma terminato.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
