package com.azienda.riepilogo.utilities;

import com.azienda.riepilogo.exception.StringIsNullException;


public class StringValidator {
    public static void check(String s) throws StringIsNullException {
        if (s == null || s.isEmpty()) {
            throw new StringIsNullException("Stringa nulla o vuota", null);
        }
    }
}

