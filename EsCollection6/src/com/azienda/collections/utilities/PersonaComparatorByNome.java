package com.azienda.collections.utilities;

import java.util.Comparator;

import com.azienda.collections.model.Persona;

public class PersonaComparatorByNome implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getNome().compareTo(o2.getNome());
	}

}
