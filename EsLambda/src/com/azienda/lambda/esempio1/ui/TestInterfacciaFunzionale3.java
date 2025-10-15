package com.azienda.lambda.esempio1.ui;

import com.azienda.lambda.esempio1.model.InterfacciaFunzionale3;

public class TestInterfacciaFunzionale3 {

	public static void main(String[] args) {
		try {
			InterfacciaFunzionale3 ref=(a)->{
				return a.length();
			};
			int len= ref.metodo3("Mario");
			System.out.println(len);
			
			InterfacciaFunzionale3 ref2= a -> a.substring(0, 2).length();
			len=ref2.metodo3("Ciao");
			System.out.println(len);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
