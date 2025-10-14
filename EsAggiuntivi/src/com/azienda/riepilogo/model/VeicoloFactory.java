package com.azienda.riepilogo.model;



import java.util.Scanner;

import com.azienda.riepilogo.exception.IsBooleanException;
import com.azienda.riepilogo.exception.IsFloatException;
import com.azienda.riepilogo.exception.StringIsNullException;
import com.azienda.riepilogo.exception.VeicoloNonValidoException;
import com.azienda.riepilogo.utilities.BooleanValidator;
import com.azienda.riepilogo.utilities.FloatValidator;
import com.azienda.riepilogo.utilities.StringValidator;
import com.azienda.riepilogo.utilities.VehicleValidator;

public class VeicoloFactory {

	public Veicolo creaVeicolo(String s, Scanner sc)
			throws VeicoloNonValidoException, IsFloatException, IsBooleanException, StringIsNullException {

		VehicleValidator.controllaTipoVeicolo(s);

        System.out.println("Inserisci il modello:");
        String modello = sc.nextLine();
        StringValidator.check(modello);

        System.out.println("Inserisci la velocità:");
        float velocita = FloatValidator.checkFloat(sc.nextLine());

        if (s.equalsIgnoreCase(VehicleValidator.AEREO)) {
            System.out.println("L'aereo è di linea? (true/false)");
            boolean diLinea = BooleanValidator.checkBoolean(sc.nextLine());
            return new Aereo(modello, velocita, diLinea);
        } else { 
            System.out.println("Il treno è regionale? (true/false)");
            boolean regionale = BooleanValidator.checkBoolean(sc.nextLine());
            return new Treno(modello, velocita, regionale);
        }
    }

}