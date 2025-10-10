package com.azienda.riepilogo.utilities;

import com.azienda.riepilogo.exception.IsBooleanException;

public class BooleanValidator {
    public static boolean checkBoolean(String s) throws IsBooleanException {
        if (s == null) throw new IsBooleanException("Valore booleano nullo", null);
        s = s.trim().toLowerCase();
        if (s.equals("true")) return true;
        else if (s.equals("false")) return false;
        else throw new IsBooleanException("Il valore deve essere 'true' o 'false'", null);
    }
}