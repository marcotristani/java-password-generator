package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String nome;
        String cognome;
        String colorePreferito;
        int giornoNascita;
        int meseNascita;
        int annoNascita;

        Scanner input = new Scanner(System.in);

        System.out.println("Inserire Nome:");
        nome = input.nextLine();
        System.out.println("Inserire Cognome:");
        cognome = input.nextLine();
        System.out.println("Inserire Colore preferito:");
        colorePreferito = input.nextLine();
        System.out.println("Inserire giorno di nascita:");
        giornoNascita = input.nextInt();
        System.out.println("Inserire mese di nascita:");
        meseNascita = input.nextInt();
        System.out.println("Inserire anno di nascita:");
        annoNascita = input.nextInt();
        int sumDate = giornoNascita + meseNascita + annoNascita;
        input.close();
        System.out.printf("La password generata è : %s-%s-%s-%d", nome, cognome, colorePreferito, sumDate);
    }

}
