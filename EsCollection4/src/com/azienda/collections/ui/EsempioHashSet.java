package com.azienda.collections.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EsempioHashSet {

	public static void main(String[] args) {
		try {
			Set<String> nomi = new HashSet<String>();
			nomi.add("Mario");
			nomi.add("Mario");
			nomi.add("Claudia");
			nomi.add("Laura");
			nomi.add("Stefano");
			
			System.out.println(nomi.size());
			boolean b=nomi.contains("Claudia");
			b=nomi.contains("claudia");
			nomi.remove("claudia");
			nomi.remove("Claudia");
		
			for(String s:nomi) {
				System.out.println(s);
			}
			Iterator<String> nomiIterator= nomi.iterator();
			while(nomiIterator.hasNext()) {
				String s= nomiIterator.next();
				System.out.println(s);
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
