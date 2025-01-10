import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int characterCount = countCharacters(input);
        System.out.println("The number of characters (excluding spaces) in the string is: " + characterCount);

        scanner.close();
    }

    // Method to count the number of characters excluding spaces
    public static int countCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
