package jaita.gryffindor.nicolapiacquaddio.exercise4;

import java.util.Scanner;

public class Exercise4 {

    // Creare una funzione che riceve un numero n in input che restituisce un array che comprende tutti i numeri primi compresi fra 1-n
    // QUESTO ESERCIZIO USA LA VERSIONE ITERATIVA PER LA RICERCA DEL NUMERO PRIMO
    public static void main(String[] args) {
        int n = getUserInput();
        printArray(getPrimeListUpTo(n));
    }

    public static int getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Dimmi quanti numeri primi devono stampare entro: ");
        return input.nextInt();
    }

    public static int[] getPrimeListUpTo(int n) {
        int[] allNumbers = new int[n];
        int counter = 0;
        int[] primeNumbers = null;
        for(int i = 1; i <= n; i++) {
            if(isPrime(i)) {
                counter++;
            }
        }
        System.out.println("Ho trovato "+counter+" numeri primi\nEcco i numeri primi da 0 a "+n);

        primeNumbers = new int[counter];
        int k = 0;
        for(int j = 1; j <= n; j++) {
            if(isPrime(j)) {
                primeNumbers[k] = j;
                k++;
                continue;
            }
        }
        return primeNumbers;
    }

    public static void printArray(int[] array) {
        int counterToNewLine = 0;
        for (int j : array) {
            if(counterToNewLine >= 5) {
                System.out.println();
                counterToNewLine = 0;
            }
            System.out.print(j + " ");
            counterToNewLine++;
        }
    }

    // VERSIONE ITERATIVA
    public static boolean isPrime(int n) {
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
    }
}
