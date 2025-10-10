package com.azienda.riepilogo.utilities;

import com.azienda.riepilogo.model.Veicolo;

public interface CalcolaTempi {
	public float calcolaTempiPercorrenza(Veicolo v,float distanza);
	public void informazioniMovimento(Veicolo v);
}
