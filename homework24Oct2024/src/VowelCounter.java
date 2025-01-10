import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);
        System.out.println("The number of vowels in the string is: " + vowelCount);

        scanner.close();
    }

    public static int countVowels(String input) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}
