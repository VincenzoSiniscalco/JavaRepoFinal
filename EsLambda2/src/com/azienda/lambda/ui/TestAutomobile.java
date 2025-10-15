package com.azienda.lambda.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.azienda.lambda.model.Automobile;

public class TestAutomobile {

	public static void main(String[] args) {
		Supplier<Map<Integer,Automobile>> supp=()->{
			Map<Integer,Automobile> map= 
					new HashMap<Integer, Automobile>();
			map.put(1, new Automobile("Fiat", "500", 1200, "2015"));
			map.put(-2, new Automobile("Alfa Romeo", "156", 1500, "2008"));
			map.put(3, new Automobile("Smart", "4x4", 1000, "2020"));
			map.put(-4, new Automobile("Mini", "Cooper S", 1800, "2023"));
			map.put(5, new Automobile("Audi", "A8", 2000, "2025"));
			return map;
		};
		Map<Integer,Automobile> mappa=supp.get();
		System.out.println("Stampa mappa iniziale:\n");
		mappa.forEach((i,auto)->System.out.println("Chiave "+i+" "+auto));
		
		//soglie
		int x=1500;
		int y=1500;
		
		Predicate<Map.Entry<Integer, Automobile>> soglia= entry->
			(entry.getKey()>0 && entry.getValue().getCilindrata()>x)||
			(entry.getKey()<0 && entry.getValue().getCilindrata()<y);
		
		Map<Integer,Automobile> mappaFiltrata=new HashMap<Integer, Automobile>();
		
		for(Map.Entry<Integer, Automobile> entry: mappa.entrySet()) {
			if(soglia.test(entry)) {
				mappaFiltrata.put(entry.getKey(), entry.getValue());
			}
		}
		System.out.println("Stampa mappa filtrata:\n");
		mappaFiltrata.forEach((i,auto)->System.out.println("Chiave "+i+" "+auto));
		//creazione lista auto con key positive
		Function<Map<Integer, Automobile>, List<Automobile>> mapToList= map->{
			List<Automobile> listaAuto= new ArrayList<Automobile>();
			for(Map.Entry<Integer, Automobile> entry: map.entrySet()) {
				if(entry.getKey()>0) {
					listaAuto.add(entry.getValue());
				}
			}
			return listaAuto;
		};
		
		List<Automobile> listaAutoIndicePositivo= mapToList.apply(mappaFiltrata);
		System.out.println("Auto selezionate con indice positivo:\n");
		listaAutoIndicePositivo.forEach((auto)->System.out.println(auto));
		
		List<Automobile> ordineData= new ArrayList<Automobile>(mappa.values());
		ordineData.sort((auto1,auto2)-> auto1.getDataImmatricolazione().compareTo(auto2.getDataImmatricolazione()));
		
		System.out.println("Auto visualizzate ordinate per data di immatricolazione:\n");
		ordineData.forEach((auto)->System.out.println(auto));
		
		List<Automobile> ordineCilindrata= new ArrayList<Automobile>(mappa.values());
		ordineCilindrata.sort((auto1,auto2)-> Integer.compare(auto1.getCilindrata(), auto2.getCilindrata()));
		
		System.out.println("Auto visualizzate ordinate per cilindrata:\n");
		ordineCilindrata.forEach((auto)->System.out.println(auto));
		
		
		
	}

}
