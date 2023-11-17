package jaita.gryffindor.exerciseweek2.exercise5;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vector = new int[] {15, 19, 33, 46, 52, 63, 80, 91, 103, 120, 156, 214, 244, 365, 401, 587, 890, 910, 941, 1000};

        // Si chiede all'utente di inserire un valore da tastiera
        System.out.print("Inserisci il valore da ricercare nell'array: ");

        // Si legge dalla memoria l'input inserito dall'utente e lo si salva in target
        int target = input.nextInt();
        input.close();

        //utilizzando la verisone ricorsiva che ritona l' indice, quindi controllo il risultato
        int res = binarySearch(vector, target, 0, vector.length);
        if(res == -1){
            System.out.println("Il numero cercato non è presente nell' arrray");
        } else{
            System.out.println("Il numero cercato è presente nell' array all' indice " + res);
        }

    }

    public static void binarySearch(int[] vector, int target) {
        // SI DICHIARANO LE VARIABILI NECESSARIE PER LA RICERCA BINARIA
        int initialPosition = 0;
        int lastPosition = vector.length - 1;
        int middlePosition = (lastPosition + initialPosition)/2;
        boolean found = false;
        int tries = 0;

        System.out.println("\nElemento da ricercare: "+target);
        System.out.println("Dimensione dell'array: "+vector.length);

        while(!found && initialPosition <= lastPosition) {
            tries++;
            System.out.printf("Range di ricerca numero %d: %d | %d | %d\n", tries, vector[initialPosition], vector[middlePosition], vector[lastPosition]);
            // CASO BASE
            if(target == vector[middlePosition]) {
                found = true;
                System.out.println("\nHo trovato il valore!");

                // POSSIBILE CASO: SE TARGET E' MAGGIORE DEL VALORE CUSTODITO DALLA POS. CENTRALE, SI SPOSTA IL FOCUS DI RICERCA NEL "LATO DESTRO" DELL'ARRAY
            } else if (target > vector[middlePosition]) {
                initialPosition = middlePosition + 1;
                middlePosition = (initialPosition + lastPosition)/2;

                // POSSIBILE CASO: SE TARGET E' MINORE DEL VALORE CUSTODITO DALLA POS. CENTRALE, SI SPOSTA IL FOCUS DI RICERCA NEL "LATO SINISTRO" DELL'ARRAY
            } else {
                lastPosition = middlePosition - 1;
                middlePosition = (initialPosition + lastPosition)/2;
            }
        }

        // Viene segnalato all'utente se il valore non è presente nell'array
        if(!found) {
            System.out.println("\nNon ho trovato il valore!");
        }

        System.out.println("Numero di ricerche effettuate: "+tries);
    }

    //aggiunta versione ricorsiva (ritorna l' indice della posizione dell' elemento cercato,
    // -1 se non esiste all' interno dell' array)
    static public int binarySearch(int[] myArray, int numToFind, int left, int right){
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if(myArray[mid] == numToFind) {
                return mid;
            }
            else if(numToFind < myArray[mid]){
                return binarySearch(myArray, numToFind, left, mid - 1);
            }
            else {
                return binarySearch(myArray, numToFind, mid + 1, right);
            }
        }
        return -1;
    }

}
