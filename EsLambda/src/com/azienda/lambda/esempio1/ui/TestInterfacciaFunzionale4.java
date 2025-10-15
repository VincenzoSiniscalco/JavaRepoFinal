package com.azienda.lambda.esempio1.ui;

import com.azienda.lambda.esempio1.model.InterfacciaFunzionale4;
import com.azienda.lambda.esempio1.model.Pippo;

public class TestInterfacciaFunzionale4 {

	public static void main(String[] args) {
		try {
			InterfacciaFunzionale4 ref= s->System.out.println(s);
			ref.metodo4("Ciao");
			InterfacciaFunzionale4 ref2= System.out::println;
			ref2.metodo4("Hello");
			InterfacciaFunzionale4 ref3=Pippo::metodoPluto;
			ref3.metodo4("Buongiorno");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
