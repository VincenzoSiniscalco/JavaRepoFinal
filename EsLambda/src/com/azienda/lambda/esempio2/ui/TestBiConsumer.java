package com.azienda.lambda.esempio2.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

import com.azienda.lambda.esempio2.model.CustomBiConsumer;

public class TestBiConsumer {

	public static void main(String[] args) {
		try {
			Map<Integer,String> mappa= new HashMap<Integer, String>();
			for(int i=1;i<6;i++) {
				mappa.put(i, "nome_"+i);
			}
			mappa.forEach((k,v)->System.out.println(k+" "+v));
			System.out.println("\nCustom forEach");
			BiConsumer<Integer, String> bi= new CustomBiConsumer();
			customForEach(mappa, bi);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void customForEach(Map<Integer,String>mappa,BiConsumer<Integer,String> bc) {
		Set<Entry<Integer, String>> coppie=mappa.entrySet();
		for(Entry<Integer,String> coppia:coppie) {
			bc.accept(coppia.getKey(), coppia.getValue());
		}
	}
}
