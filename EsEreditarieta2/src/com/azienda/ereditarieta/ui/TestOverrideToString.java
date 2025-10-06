package com.azienda.ereditarieta.ui;

import com.azienda.ereditarieta.model.OverrideToString;

public class TestOverrideToString {

	public static void main(String[] args) {
		OverrideToString over = new OverrideToString("Mario");
		System.out.println(over);
		String s="Benvenuto "+ over;
		System.out.println(s);

	}

}
