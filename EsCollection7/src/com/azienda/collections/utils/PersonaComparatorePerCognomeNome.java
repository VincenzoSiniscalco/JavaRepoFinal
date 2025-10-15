package com.azienda.collections.utils;

import java.util.Comparator;

import com.azienda.collections.model.Contatto;


public class PersonaComparatorePerCognomeNome implements Comparator<Contatto>{


	@Override
	public int compare(Contatto o1, Contatto o2) {
		int result=o1.getPersona().getCognome().compareToIgnoreCase(o2.getPersona().getCognome());
		if(result!=0) {
			return result;
		}
		return o1.getPersona().getNome().compareToIgnoreCase(o2.getPersona().getNome());
	}
}


 