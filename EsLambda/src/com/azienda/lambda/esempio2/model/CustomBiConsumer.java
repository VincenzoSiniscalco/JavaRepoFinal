package com.azienda.lambda.esempio2.model;

import java.util.function.BiConsumer;

public class CustomBiConsumer implements BiConsumer<Integer, String>{

	@Override
	public void accept(Integer t, String u) {
		System.out.println(u.toUpperCase());
		
	}

}
