package com.azienda.lambda.esempio2.ui;

import java.time.LocalDate;
import java.util.function.Function;

import com.azienda.lambda.esempio2.model.CustomFunction;

public class TestFunction {

	public static void main(String[] args) {
		try {
			Function<LocalDate, String> f = d-> d.toString();
			String s= f.apply(LocalDate.now());
			System.out.println(s+"\n");
			Function<LocalDate, String> f2=new CustomFunction();
			s=f2.apply(LocalDate.now());
			System.out.println(s);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
