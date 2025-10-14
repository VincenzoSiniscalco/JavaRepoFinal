package com.azienda.collections.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		try {
			Map<Integer, String> nomi= new HashMap<Integer, String>();
			nomi.put(-16, "Mario");
			nomi.put(-16, "Giovanni");
			nomi.put(27, "Laura");
			nomi.put(2, "Anna");
			nomi.put(18, "Francesco");
			
			String s= nomi.get(27);
			s= nomi.get(28);
			System.out.println(nomi.size());
			
			nomi.remove(18);
			nomi.remove(19);
			
			boolean b= nomi.containsKey(2);
			b=nomi.containsKey(3);
			
			b=nomi.containsValue("Anna");
			b=nomi.containsValue("anna");
			
			Set<Integer> chiavi= nomi.keySet();
			for(Integer chiave:chiavi) {
				System.out.println(nomi.get(chiave));
			}
			
			Set<Entry<Integer, String>> coppie= nomi.entrySet();
			for(Entry<Integer, String> coppia:coppie) {
				System.out.println(coppia.getKey() + " " + coppia.getValue());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
