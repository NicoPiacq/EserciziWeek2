package jaita.gryffindor.nicolapiacquaddio.exercise2;

import java.util.Scanner;

public class Exercise2 {

    // Una funzione che stampa tutti i primi n numeri di fibonacci calcolando in maniera iterativa 5 punti per casa
    public static void main(String[] args) {
        int n = getUserInput();
        fibonacciIterativo(n);
    }

    public static int getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero per la sequenza di Fibonacci: ");
        return input.nextInt();
    }

    public static int fibonacciIterativo(int n) {
        int ris = 0;
        int n1 = 0, n2 = 1;

        System.out.print(0 + " ");
        if(n == 0) {
            return ris;
        }

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                ris = 1;
            }
            System.out.print(ris + " ");
            ris = n1 + n2;
            n1 = n2;
            n2 = ris;
        }
        return ris;
    }
}
