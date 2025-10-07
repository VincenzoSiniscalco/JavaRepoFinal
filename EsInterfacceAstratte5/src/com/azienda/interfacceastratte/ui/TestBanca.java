package com.azienda.interfacceastratte.ui;

import java.util.Scanner;

import com.azienda.interfacceastratte.model.Banca;
import com.azienda.interfacceastratte.model.BancaConcreta;
import com.azienda.interfacceastratte.model.BancaConcretaB;

public class TestBanca {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Scegliere una banca oppure uscire dal programma: ");
            System.out.println("1 - Banca A ");
            System.out.println("2 - Banca B ");
            System.out.println("0 - Esci");
            System.out.print("Scelta: ");

            int sceltaBanca = scanner.nextInt();

            if (sceltaBanca == 0) {
                continua = false;
                System.out.println("Chiusura del programma.");
                break;
            }

            System.out.println("Scegli la tipologia di conto:");
            System.out.println("1 - Conto Online");
            System.out.println("2 - Conto in Filiale");
            System.out.print("Scelta: ");
            int tipoConto = scanner.nextInt();

            System.out.print("Inserisci l'importo del saldo: ");
            double saldo = scanner.nextDouble();

            Banca banca = null;

            switch (sceltaBanca) {
                case 1:
                    banca = new BancaConcreta(saldo);
                    break;
                case 2:
                    banca = new BancaConcretaB(saldo);
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
                    continue;
            }

            double saldoEffettivo = banca.saldoEffettivo(tipoConto);
            double tassoPercentuale = (banca.getTassoInteresse(tipoConto) - 1) * 100;

            System.out.println("Risultato:");
            System.out.printf("Saldo iniziale: %.2f €\n", banca.saldoNoInteressi());
            System.out.printf("Tasso di interesse applicato: %.2f%%\n", tassoPercentuale);
            System.out.printf("Saldo finale (con interessi): %.2f €\n", saldoEffettivo);
        }

        scanner.close();
    }
}

