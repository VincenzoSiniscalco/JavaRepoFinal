package com.azienda.lambda.esempio1.ui;

import com.azienda.lambda.esempio1.model.InterfacciaFunzionale5;

public class TestInterfacciaFunzionale5 {
	public static void main(String[] args) {
		try {
			InterfacciaFunzionale5 ref=String::substring;
			System.out.println(ref.metodo5("Ciao", 1));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
