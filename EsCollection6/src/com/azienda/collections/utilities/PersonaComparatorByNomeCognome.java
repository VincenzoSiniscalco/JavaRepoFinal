package com.azienda.collections.utilities;

import java.util.Comparator;

import com.azienda.collections.model.Persona;

public class PersonaComparatorByNomeCognome implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		int result=o1.getCognome().compareTo(o2.getCognome());
		if(result!=0) {
			return result;
		}
		return o1.getNome().compareTo(o2.getNome());
	}

}
