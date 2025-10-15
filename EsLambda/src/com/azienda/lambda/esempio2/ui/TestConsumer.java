package com.azienda.lambda.esempio2.ui;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.azienda.lambda.esempio2.model.CustomConsumer;

public class TestConsumer {

	public static void main(String[] args) {
		try {
			List<String> nomi= Arrays.asList("Mario","Laura","Carlo","Anna");
			nomi.forEach(new CustomConsumer());

			System.out.println("\nMetodo 2:");
			nomi.forEach(s->System.out.println(s.toUpperCase()));

			System.out.println("\nMetodo 3:");
			nomi.forEach(System.out::println);

			System.out.println("\nCustom ForEach ");
			customForEach(nomi, System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void customForEach(List<String> lista,Consumer<String> consumer) {
		for(String s:lista) {
			consumer.accept(s);
		}
	}
}
