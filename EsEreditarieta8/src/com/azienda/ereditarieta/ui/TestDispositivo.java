package com.azienda.ereditarieta.ui;

import java.util.Scanner;

import com.azienda.ereditarieta.model.Cellulare;
import com.azienda.ereditarieta.model.DispositivoMultimediale;
import com.azienda.ereditarieta.model.Televisore;

public class TestDispositivo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DispositivoMultimediale c1= new Cellulare("Samsung", "Galaxy s22", 980.50f, 50);
		DispositivoMultimediale t1= new Televisore("LG", "OLED evo", 589.99f, 70, 5);
		
		usa(c1,null);
		usa(t1,sc);
		
		sc.close();
	}

	public static void usa(DispositivoMultimediale m, Scanner sc) {
		if(m instanceof Cellulare) {
			Cellulare ref= (Cellulare) m;
			ref.chiama();
			ref.rispondi();
		}else if(m instanceof Televisore) {
			Televisore ref= (Televisore) m;
			System.out.println("Che canale vuoi guardare?");
			ref.cambiaCanale(sc.nextInt());
		}
			System.out.println(m);
		}
	}

