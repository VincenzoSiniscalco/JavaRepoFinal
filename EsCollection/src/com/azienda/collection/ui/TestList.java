package com.azienda.collection.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.azienda.collection.model.Animale;
import com.azienda.collection.model.Zoo;

public class TestList {

	public static void main(String[] args) {
		try {
			List<String> nomi= new ArrayList<String>();
			System.out.println(nomi.size());
			nomi.add("Mario");
			nomi.add("Andrea");
			nomi.add("Anna");
			nomi.add("Marco");
			nomi.add(1, "Claudio");
			try {
				nomi.add(6,"Pietro");
			} catch (Exception e) {
				e.printStackTrace();
			}
			String s= nomi.get(3);
			System.out.println(s);
			try {
				s=nomi.get(7);
			} catch (Exception e) {
				e.printStackTrace();
			}
			boolean b= nomi.contains("Anna");
			b= nomi.contains("anna");
			nomi.remove("Anna");
			nomi.remove("Claudio");
			
			for(int i=0;i<nomi.size();i++) {
				System.out.println(nomi.get(i));
			}
			
			for(String s2:nomi) {
				System.out.println(s2);
			}
			
			List<Animale> animali= new ArrayList<Animale>();
			animali.add(new Animale("cane","pastore tedesco"));
			animali.add(new Animale("gatto","persiano"));
			animali.add(new Animale("squalo","martello"));
			animali.add(1, new Animale("tigre", "bianca"));
			
			Animale a= animali.get(2);
			System.out.println(a);
			
			b=animali.contains(new Animale("squalo","martello"));
			animali.remove(new Animale("squalo","martello"));
			
			List<String> nomi2 = Arrays.asList("Mario","Andrea","Anna"); 
			List<Animale> animali2= Arrays.asList(new Animale("nome","razza"), 
					new Animale("nome2","razza2"));
			
			Iterator<String> itNomi2= nomi2.iterator();
			while(itNomi2.hasNext()) {
				String x= itNomi2.next();
				System.out.println(x);
			}
			
			Iterator<Animale> itAnimali2= animali2.iterator();
			while(itAnimali2.hasNext()) {
				Animale y= itAnimali2.next();
				System.out.println(y);
			}
			
			Zoo z= new Zoo("zoo1",animali);
			z.getAnimali().add(new Animale("cane", "carlino"));
			
			System.out.println("Programma terminato.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
