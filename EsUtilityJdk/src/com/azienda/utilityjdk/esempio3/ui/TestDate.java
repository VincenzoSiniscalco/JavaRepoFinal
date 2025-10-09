package com.azienda.utilityjdk.esempio3.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestDate {

	public static void main(String[] args) {
		try {
			LocalDate oggi= LocalDate.now();
			System.out.println(oggi);
			
			LocalDate ld= LocalDate.of(2025, 5, 4);
			System.out.println(ld);
			
			LocalDate ld2= LocalDate.parse("2025-02-03");
			System.out.println(ld2);
			
			try {
				ld2= LocalDate.parse("03-02-2025");
			} catch (Exception e) {
				System.out.println("Errore");
			}
			LocalTime adesso= LocalTime.now();
			System.out.println(adesso);
			
			LocalTime lt= LocalTime.of(15, 0);
			System.out.println(lt);
			
			LocalDateTime ldt= LocalDateTime.now();
			System.out.println(ldt);
			ldt=LocalDateTime.of(ld, lt);
			System.out.println(ldt);
			
			DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			ldt= LocalDateTime.now();
			System.out.println(ldt);
			System.out.println(ldt.format(dtf));
			
			ldt = LocalDateTime.parse("02/06/2025 12:35:22",dtf); 
			System.out.println(ldt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
