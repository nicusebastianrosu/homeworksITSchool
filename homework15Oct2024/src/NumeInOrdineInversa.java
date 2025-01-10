import java.util.Scanner;

public class NumeInOrdineInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Introduceți numele nr. " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("Numele în ordine inversă sunt:");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
