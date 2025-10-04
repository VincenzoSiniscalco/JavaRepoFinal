package com.azienda.override.ui;

import com.azienda.override.model.Child;

public class TestOverride {
	public static void main(String[] args) {
		Child c= new Child();
		c.setStringa1("Stringa 1");
		c.setStringa2("Stringa 2");
		c.setStringa3("Stringa 3");
		c.setParentStringa3("Parent stringa 3");
		c.setStringa4("Stringa 4");
		System.out.println("Programma terminato.");
	}
}
