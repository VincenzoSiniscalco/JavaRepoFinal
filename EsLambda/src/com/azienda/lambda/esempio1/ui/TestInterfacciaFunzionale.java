package com.azienda.lambda.esempio1.ui;

import com.azienda.lambda.esempio1.model.InterfacciaFunzionale;

public class TestInterfacciaFunzionale {

	public static void main(String[] args) {
		try {
			
			InterfacciaFunzionale ref= (a,b)->{
				System.out.println("primo input: "+a);
				System.out.println("secondo input: "+b);
				};
			ref.metodo("Mario", 10);
			test(ref);
			
			test((a,b)->{
				System.out.println(a+ " ha " + b + " anni");
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void test(InterfacciaFunzionale ref) {
		ref.metodo("Claudia",15);
	}
	
}
