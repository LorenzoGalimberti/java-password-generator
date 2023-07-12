package org.java.lessons.securuty;
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {

        // creazione dello scanner object
        Scanner scanner = new Scanner(System.in);
        // creazione e inserimento delle variabili
        System.out.print("Inserisci il tuo nome : ");
        String name = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome : ");
        String surname = scanner.nextLine();


        System.out.print("Inserisci il tuo colore preferito : ");
        String favouriteColor = scanner.nextLine();

        System.out.print("Inserisci il tuo giorno di nascita: ");
        int birthDay = scanner.nextInt();

        System.out.print("Inserisci il tuo mese di nascita: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Inserisci il tuo anno di nascita: ");
        int birthYear = scanner.nextInt();


        // generazione password
        int sommaDate=birthDay+birthMonth+birthYear;
        String passwordGenerated=name+"-"+surname+"-"+favouriteColor+"-"+sommaDate;

        // stampo il risultato

        System.out.println(passwordGenerated);


    }
}
