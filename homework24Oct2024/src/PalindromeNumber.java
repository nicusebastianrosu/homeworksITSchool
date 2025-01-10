public class PalindromeNumber {
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int[] testNumbers = {121, 12321, 123321, 456754, 78987};

        for (int num : testNumbers) {
            if (isPalindrome(num)) {
                System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " is not a palindrome.");
            }
        }
    }
}
