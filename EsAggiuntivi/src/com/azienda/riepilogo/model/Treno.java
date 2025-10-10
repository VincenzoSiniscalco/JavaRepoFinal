package com.azienda.riepilogo.model;



import com.azienda.riepilogo.utilities.CalcolaTempi;


public class Treno extends Veicolo implements CalcolaTempi{
	
	private boolean regionale;
	
	public Treno(String modello, float velocita, boolean regionale) {
		super(modello, velocita);
		this.regionale=regionale;
		}

	public boolean isRegionale() {
		return regionale;
	}

	public void setRegionale(boolean regionale) {
		this.regionale = regionale;
	}
	
	public void percorreBinari() {
		if(regionale) {
			System.out.println("Il treno regionale "+ super.getModello() + " viaggia ad una velocità massima di " + super.getVelocita());
		}else {
			System.out.println("Il treno non regionale "+ super.getModello() + " viaggia ad una velocità massima di " + super.getVelocita());
		}
		
	}

//	@Override
//	public float calcolaTempiPercorrenza(Veicolo v, float distanza) {
//		
//		return distanza/v.getVelocita();
//	}


    @Override
    public void informazioniMovimento(Veicolo v) {
        if (regionale)
            System.out.println("Il treno è regionale.");
        else
            System.out.println("Il treno non è regionale.");
    }

}
