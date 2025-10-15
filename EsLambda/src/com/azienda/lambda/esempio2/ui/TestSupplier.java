package com.azienda.lambda.esempio2.ui;

import java.time.LocalDate;
import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		try {
			Supplier<LocalDate> supp = ()->{
				System.out.println("Sto calcolando la data: ");
				LocalDate date=LocalDate.of(2025, 5, 3);
				System.out.println("Finito di calcolare la data: ");
				return date;
			};
			LocalDate data1= supp.get();
			System.out.println(data1);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
