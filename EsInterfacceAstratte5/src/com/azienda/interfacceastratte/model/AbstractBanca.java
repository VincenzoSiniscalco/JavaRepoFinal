package com.azienda.interfacceastratte.model;

public abstract class AbstractBanca implements Banca{
	
	private double saldo;

	public AbstractBanca(double saldo) {
		this.saldo=saldo;
	}
	@Override
	public double saldoNoInteressi() {
		return saldo;
	}
	@Override
	public abstract double getTassoInteresse(int tipoConto);
	
	@Override
	public double saldoEffettivo(int tipoConto) {
		return saldo * getTassoInteresse(tipoConto);
	}

}
