package jaita.gryffindor.exerciseweek2.exercise4;

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
        System.out.print("Inserisci il numero limite massimo: "); //cambiato messaggio
        return input.nextInt();
    }

    //suggerimento implementativo, creo un array di dimensione n tanto sarà sempre abbastanza grande
    //per contenere tutti i numeri primi da 0 a n; in seguito poi copiamo l' array in un array di dimensioni corrette

    public static int[] getPrimeListUpTo(int n) {
        int counter = 0;
        int[] primeNumbersTemp = new int[n];
        for(int i = 1; i <= n; i++) {
            if(isPrime(i)) {
                primeNumbersTemp[counter] = i;
                counter++;
            }
        }
        System.out.println("Ho trovato "+counter+" numeri primi\nEcco i numeri primi da 0 a "+n);

        int[] primeNumbers = new int[counter];
//        int k = 0;
//        for(int j = 1; j <= n; j++) {
//            if(isPrime(j)) {
//                primeNumbers[k] = j;
//                k++;
//            }
//        }
        System.arraycopy(primeNumbersTemp, 0, primeNumbers, 0, counter);
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
