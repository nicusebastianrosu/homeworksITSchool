package homework04;

public class StringReverser {
    public static void main(String[] args) {
        // Lambda expression to reverse a string
        Transformer<String> reverseString = str -> new StringBuilder(str).reverse().toString();

        // Test the lambda expression
        String inputString = "Hello, World!";
        String reversedString = reverseString.transform(inputString);

        // Output the result
        System.out.println("Original: " + inputString);
        System.out.println("Reversed: " + reversedString);
    }
}