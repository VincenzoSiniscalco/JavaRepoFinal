package com.azienda.lambda.esempio1.ui;

import com.azienda.lambda.esempio1.model.Computer;
import com.azienda.lambda.esempio1.model.InterfacciaFunzionale6;

public class TestInterfacciaFunzionale6 {

	public static void main(String[] args) {
		try {
			InterfacciaFunzionale6 ref=Computer::new;
			Computer c=ref.metodo6("HP");
			System.out.println(c);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
