import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int reversed = 0;

        do {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        } while (number != 0);

        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
