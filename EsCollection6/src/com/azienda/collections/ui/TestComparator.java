package com.azienda.collections.ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.azienda.collections.model.Persona;
import com.azienda.collections.utilities.PersonaComparatorByNome;
import com.azienda.collections.utilities.PersonaComparatorByNomeCognome;

public class TestComparator {

	public static void main(String[] args) {
		try {
			List<String> nomi = Arrays.asList("Mario","Laura","Andrea","Barbara");
			Collections.sort(nomi);
			for(String nome:nomi) {
				System.out.println(nome);
			}
			List<Integer> numeri = Arrays.asList(3,1,7,-2);
			Collections.sort(numeri);
			Iterator<Integer> numeriIterator = numeri.iterator();
			while(numeriIterator.hasNext()) {
				System.out.println(numeriIterator.next());
			}
			List<Persona> persone = Arrays.asList(new Persona("Mario","Rossi"),
					new Persona("Anna","Rossi"),new Persona("Anna","Verdi"),
					new Persona("Claudia","Bianchi"));
			Collections.sort(persone);
			printPersone(persone);
			Collections.sort(persone, new PersonaComparatorByNome());
			System.out.println("\nPersone ordinate per nome:");
			printPersone(persone);
			System.out.println("\nPersone ordinate per cognome e nome:");
			Collections.sort(persone, new PersonaComparatorByNomeCognome());
			printPersone(persone);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void printPersone(List<Persona> persone) {
		for(Persona p:persone) {
			System.out.println(p);
		}
	}
}
