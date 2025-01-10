import java.util.Scanner;

public class Prime {
    public static boolean estePrim(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti limita: ");
        int limit = scanner.nextInt();

        System.out.println("Numerele prime pana la " + limit + " sunt: ");
        for (int i = 2; i <= limit; i++) {
            if (estePrim(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
