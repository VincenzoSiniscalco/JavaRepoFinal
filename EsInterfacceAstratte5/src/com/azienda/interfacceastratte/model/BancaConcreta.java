package com.azienda.interfacceastratte.model;

public class BancaConcreta extends AbstractBanca{

	private static final double TASSO_ONLINE = 1.02;   // +2%
    private static final double TASSO_FILIALE = 1.01;  // +1%

    public BancaConcreta(double saldo) {
        super(saldo);
    }
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
