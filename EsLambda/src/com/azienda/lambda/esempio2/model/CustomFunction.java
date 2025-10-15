package com.azienda.lambda.esempio2.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class CustomFunction implements Function<LocalDate, String>{

	@Override
	public String apply(LocalDate t) {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return t.format(dtf);
	}

}
