package com.azienda.utilityjdk.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import com.azienda.utilityjdk.exception.DateFormatException;
import com.azienda.utilityjdk.model.FormatoData;

public class DateValidator {
	public static LocalDate check(String s) throws DateFormatException{
		try {
		LocalDate ld= LocalDate.parse(s,FormatoData.dtf);
		return ld;
		} catch (DateTimeParseException e) {
			throw new DateFormatException("Errore",null);
		}
		
	}
}
