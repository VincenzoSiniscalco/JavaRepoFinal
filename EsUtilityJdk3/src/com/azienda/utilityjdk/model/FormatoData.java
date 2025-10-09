package com.azienda.utilityjdk.model;

import java.time.format.DateTimeFormatter;

public interface FormatoData {
	DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
}
