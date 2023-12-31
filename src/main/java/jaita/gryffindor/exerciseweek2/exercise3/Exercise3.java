package jaita.gryffindor.exerciseweek2.exercise3;

import java.util.Scanner;

public class Exercise3 {

    // Una funzione che trovi dato un numero n se è primo o no
    // QUESTA VERSIONE DEL PROGRAMMA USA LA VERSIONE RICORSIVA PER LA RICERCA DEL NUMERO PRIMO
    public static void main(String[] args) {

        int n = getUserInput();

        if(isPrime(n, 2)) {
            System.out.println("E' primo");
        } else {
            System.out.println("Non è primo");
        }
    }

    //aggiunto controlli direttamente nell' acquisizione dell' input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("Inserisci un numero maggiore di 0 per capire se è primo o no: ");
            input = scanner.nextInt();
        } while(input <= 0);
        return input;
    }

    // VERSIONE ITERATIVA
    /* public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        int fattori = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                fattori++;
            }
        }
        return fattori <= 2;
    } */

    // VERSIONE RICORSIVA
    public static boolean isPrime(int n, int i){
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i > Math.sqrt(n))
            return true;

        return isPrime(n, i+1);
    }
}
