import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Case-sensitive comparison
        if (string1.equals(string2)) {
            System.out.println("The strings are equal (case-sensitive).");
        } else {
            System.out.println("The strings are not equal (case-sensitive).");
        }

        // Case-insensitive comparison
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("The strings are equal (case-insensitive).");
        } else {
            System.out.println("The strings are not equal (case-insensitive).");
        }

        scanner.close();
    }
}
