package com.azienda.lambda.esempio2.ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.azienda.lambda.esempio2.model.Fotocamera;

public class TestFotocamera {

	public static void main(String[] args) {
		try {
			List<Fotocamera> fotocamere= Arrays.asList(new Fotocamera("Modello1", 2022, 2.5f),new Fotocamera("Modello2", 2020, 1.5f),new Fotocamera("Modello3", 2025, 4.5f)); 
			Collections.sort(fotocamere);
			
			System.out.println("Stampa ordinata per anno:\n");
			fotocamere.forEach(f->System.out.println(f));
			
			Comparator<Fotocamera> comparatorModello=(f1,f2)-> f1.getModello().compareTo(f2.getModello());
			Collections.sort(fotocamere, comparatorModello);
			
			System.out.println("Stampa ordinata per modello:\n");
			fotocamere.forEach(System.out::println);
			
			System.out.println("Stampa ordinata per megapixel:\n");
			Collections.sort(fotocamere, (f1,f2)-> f1.getMegapixel().compareTo(f2.getMegapixel()));
			fotocamere.forEach(System.out::println);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
