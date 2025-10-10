package com.azienda.riepilogo.utilities;

import com.azienda.riepilogo.exception.VeicoloNonValidoException;



public class VehicleValidator {
	public static final String AEREO = "Aereo";
	public static final String TRENO = "Treno";

	public static void controllaTipoVeicolo(String tipo) throws VeicoloNonValidoException {
		if (tipo == null || tipo.isEmpty() || 
				(!tipo.equalsIgnoreCase(AEREO) && !tipo.equalsIgnoreCase(TRENO))) {
			throw new VeicoloNonValidoException("Tipo di veicolo non valido: ",null);
		}
	}
}