package homework01;

import java.util.function.Function;

public class StringLengthExample {
    public static void main(String[] args) {
        // Lambda expression to calculate the length of a string
        Function<String, Integer> stringLength = str -> str.length();

        // Test the lambda expression
        String testString = "Hello, World!";
        int length = stringLength.apply(testString);

        // Output the result
        System.out.println("The length of the string is: " + length);
    }
}
