package com.azienda.interfacceastratte.model;

public interface Banca {
	int CONTO_ONLINE=1;   
	int CONTO_FILIALE=2;

	
	public double saldoNoInteressi();
	
	public double getTassoInteresse(int tipoConto);
	
	public double saldoEffettivo(int tipoConto);
	
}
