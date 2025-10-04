package com.amazon.sintassiBase.ui;

public class Esempio3 {

	public static void main(String[] args) {
		
		byte b=15;
		int i=b;
		System.out.println(i);

		b=(byte) i;
		System.out.println(b);
		
		i=130;  
		b=(byte)i;
		System.out.println(b); // qui l'intero è forzato ad un byte, ma è fuori
							   // dal range dei byte (-127/127) e quindi la conversione è sfalsata
		
		float f = i;
		System.out.println(f);
		
		f = 44.99f;
		i=(int) f;
		System.out.println(i);
		
		long a = 3_000_000_000l; //2 miliardi è nel range di int, se aumento a 3 miliardi genero errore
								 // a meno di non specificare il tipo (L)
		
		f=12.33f;
		
		long c = a+i;
		System.out.println(c);
		
		float d = i + f;
		System.out.println(d);
		
		byte b1 = 127;
		byte b2 = 1;
		byte b3 = (byte) (b1 + b2); //qui forzo il cast ma il risultato è fuori range
		int b4 = b1 + b2;
		
		System.out.println(b3);
		System.out.println(b4);
	}

}
