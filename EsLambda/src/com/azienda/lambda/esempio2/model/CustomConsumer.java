package com.azienda.lambda.esempio2.model;

import java.util.function.Consumer;

public class CustomConsumer implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t.toUpperCase());
		
	}
	
}
