package homework01;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Step 1: Create a Predicate<Integer> with a lambda expression
        Predicate<Integer> isGreaterThanTen = number -> number > 10;

        // Step 2: Test the predicate with various numbers
        int[] testNumbers = {5, 10, 15, 20};

        for (int number : testNumbers) {
            System.out.println("Is " + number + " greater than 10? " + isGreaterThanTen.test(number));
        }
    }
}
