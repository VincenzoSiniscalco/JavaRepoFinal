package com.azienda.lambda.esempio2.ui;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		try {
			Predicate<Integer> p = i-> {
				if(i>0) {
					return true;
				}return false;
			};
			boolean b=p.test(5);
			System.out.println(b);
			
			Predicate<Integer> p2= i-> i>0;
			System.out.println(p2.test(-6));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
