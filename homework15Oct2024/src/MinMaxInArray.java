import java.util.Random;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        // Se initializeaza matricea cu numere aleatorii
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // Valori aleatorii între 0 și 99
        }

        // Se afiseaza matricea
        System.out.print("Matricea: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // cel mai mic și cel mai mare element din matricea cu numere aleatorii
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // se afișeaza rezultatele
        System.out.println("Cel mai mic element din matrice: " + min);
        System.out.println("Cel mai mare element din matrice: " + max);

    }
}
