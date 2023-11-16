package jaita.gryffindor.nicolapiacquaddio.exercise1;

import java.util.Scanner;

public class Exercise1 {

    // 1) Calcolare fattoriale di numero n in maniera iterativa e in maniera ricorsiva
    public static void main(String[] args) {
        int n = getUserInput();
        System.out.println("Fattoriale ricorsivo: "+fattorialeRicorsivo(n));
        System.out.println("Fattoriale iterativo: "+fattorialeIterativo(n));
    }

    public static int getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero da calcolarne il fattoriale: ");
        return input.nextInt();
    }

    public static int fattorialeRicorsivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fattorialeRicorsivo(n-1);
    }

    public static int fattorialeIterativo(int n) {
        int ris = 1;
        for (int i = 0; i <= n; i++) {
            if (i != 0) {
                ris *= i;
            }
        }
        return ris;
    }
}
