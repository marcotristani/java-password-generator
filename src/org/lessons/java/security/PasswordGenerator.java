package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // Definisco variabili di istanza
        String nome;
        String cognome;
        String colorePreferito;
        int giornoNascita;
        int meseNascita;
        int annoNascita;

        // creo oggetto scanner per prendere dati in input da tastiera
        Scanner input = new Scanner(System.in);

        // stampo messaggi e salvo variabili input nelle mie variabili di istanza
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

        // chiudo scanner
        input.close();

        // stampo la stringa formattata con i dati
        System.out.printf("La password generata è : %s-%s-%s-%d", nome, cognome, colorePreferito, sumDate);
    }

}
