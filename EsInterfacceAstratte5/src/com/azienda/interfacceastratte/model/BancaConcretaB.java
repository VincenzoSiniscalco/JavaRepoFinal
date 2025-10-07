package com.azienda.interfacceastratte.model;

public class BancaConcretaB extends AbstractBanca{

	private static final double TASSO_ONLINE = 1.03;  
	private static final double TASSO_FILIALE = 1.015;

	public BancaConcretaB(double saldo) {
		super(saldo);
	}
	@Override
	public double getTassoInteresse(int tipoConto) {
		switch (tipoConto) {
		case CONTO_ONLINE:
			return TASSO_ONLINE;
		case CONTO_FILIALE:
			return TASSO_FILIALE;
		default:
			System.err.println("Tipo di conto non valido.");
			return 1;
		}
	}
}
