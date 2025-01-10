import java.util.Scanner;

public class VowelCounterNo2 {
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

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            for (int j = 0; j < vowels.length(); j++) {
                if (c == vowels.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
