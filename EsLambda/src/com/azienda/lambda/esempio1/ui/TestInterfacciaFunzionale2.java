package com.azienda.lambda.esempio1.ui;

import com.azienda.lambda.esempio1.model.InterfacciaFunzionale2;

public class TestInterfacciaFunzionale2 {

	public static void main(String[] args) {
		try {
			InterfacciaFunzionale2 ref=(a,b)-> System.out.println(a +" "+ b);
			ref.metodo2("Mario", "Rossi");
			InterfacciaFunzionale2 ref2=(a,b)-> System.out.println(a.toUpperCase()+" "+b.toUpperCase());
			ref2.metodo2("Laura", "Verdi");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
