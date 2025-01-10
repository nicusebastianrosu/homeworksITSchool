public class StringManipulation {


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


    public static String reverseString(String input) {

        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {

        String text = "Nicu Sebastian";

        int vowelCount = countVowels(text);
        String reversedText = reverseString(text);

        System.out.println("Original text: " + text);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Reversed text: " + reversedText);
    }
}
