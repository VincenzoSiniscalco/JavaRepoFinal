package com.azienda.exception3.ui;

import java.util.Scanner;

import com.azienda.exception3.exception.StringaTroppoCortaException;
import com.azienda.exception3.utils.StringValidator;

public class TestValidator {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int scelta;
			do {
				System.out.println("Inserire un nome: ");
				String nome=sc.nextLine();
				StringValidator.check(nome);
				System.out.println("Nome valido.");
				System.out.println("Per terminare digita zero.");
				scelta=sc.nextInt();
				sc.nextLine();
			}while(scelta!=0);
		} catch (StringaTroppoCortaException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("Errore imprevisto.");
		}

	}

}
