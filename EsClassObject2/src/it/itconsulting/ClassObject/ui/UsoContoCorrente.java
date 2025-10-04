package it.itconsulting.ClassObject.ui;

import java.util.Scanner;

import it.itconsulting.ClassObject.model.Banca;
import it.itconsulting.ClassObject.model.ContoCorrente;
import it.itconsulting.ClassObject.model.Indirizzo;

public class UsoContoCorrente {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		Indirizzo indirizzo=new Indirizzo("Roma", "Piazza di Spagna", 1);
		if(indirizzo.getCitta()==null||indirizzo.getStradaPiazza()==null||indirizzo.getNumeroCivico()==0) {
			System.err.println("L'indirizzo non esiste!");
		}else {
			System.out.println("L'indirizzo è: " + indirizzo.descrizione() );
		}
		Banca banca= new Banca("Unicredit", indirizzo);
		if(banca.getIndirizzo()==null||banca.getNome()==null) {
			System.err.println("Impossibile trovare l'indirizzo della banca!");
		}else {
			System.out.println("La banca è: "+ banca.descrizione());
		}
		ContoCorrente cc1= new ContoCorrente("IT98756934078", 120000.0f, banca); 
		ContoCorrente cc2= new ContoCorrente("IT89572984587", 55000.0f, banca); 

		if(cc1.getNumeroConto()==null||cc1.getSaldo()<0||cc1.getBanca()==null) {
			System.err.println("Il conto corrente non esiste!");
		}else {
			System.out.println("Conto corrente: "+ cc1.descrizione());
		}
		if(cc2.getNumeroConto()==null||cc2.getSaldo()<0||cc2.getBanca()==null) {
			System.err.println("Il conto corrente non esiste!");
		}else {
			System.out.println("Conto corrente: "+ cc2.descrizione());
		}
		if(cc1.getNomeBanca()==null||cc1.getCittaBanca()==null) {
			System.err.println("Non esiste una banca associata al conto!");
		}else {
			System.out.println("Conto corrente aperto nella banca "+ cc1.getNomeBanca()+ " con sede a " + cc1.getCittaBanca());
		}

		if(cc2.getNomeBanca()==null||cc2.getCittaBanca()==null) {
			System.err.println("Non esiste una banca associata al conto!");
		}else {
			System.out.println("Conto corrente aperto nella banca "+ cc2.getNomeBanca()+ " con sede a " + cc2.getCittaBanca());
		}
		float importo;
		do {
			System.out.println("Inserire un importo: ");
			importo= sc.nextFloat();
			if(importo<0) {
				System.err.println("L'importo dev'essere positivo!");
			}
		}while(importo<0);

		if((cc2.getSaldo()-importo)>=0) {
			cc1.setSaldo(importo+cc1.getSaldo());
			cc2.setSaldo(cc2.getSaldo()-importo);
		}
		System.out.println("Conto corrente: "+ cc1.descrizione());
		System.out.println("Conto corrente: "+ cc2.descrizione());


		sc.close();
	}

}
