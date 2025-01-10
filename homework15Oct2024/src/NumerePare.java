import java.util.Scanner;

public class NumerePare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr întreg n: ");
        int n = scanner.nextInt();

        System.out.println("Primele " + n + " numere pare sunt:");
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i);
        }
    }
}
