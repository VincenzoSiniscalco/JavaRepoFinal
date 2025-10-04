package com.azienda.classObject.ui;

import com.azienda.classObject.model.EsempioStatic;

public class TestStatic {
	public static void main(String[] args) {
	
		System.out.println(EsempioStatic.nomeStatico);
		EsempioStatic.nomeStatico="Mario";
		
		EsempioStatic ref1= new EsempioStatic();
		ref1.nome="Anna";
		
		EsempioStatic ref2= new EsempioStatic();
		ref2.nome="Eva";
		
		EsempioStatic.metodoStatico();
		ref1.metodo();
		ref2.metodo();
		
		controllo();
	
	}
	public static int controllo() {
		return 0;
	}
	
}
