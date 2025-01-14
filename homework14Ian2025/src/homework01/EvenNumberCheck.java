package homework01;

import java.util.function.Predicate;

public class EvenNumberCheck {
    public static void main(String[] args) {
        // Predicate to check if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Test the predicate with a few numbers
        int number1 = 4;
        int number2 = 7;

        // Output the results
        System.out.println(number1 + " is even: " + isEven.test(number1));  // true
        System.out.println(number2 + " is even: " + isEven.test(number2));  // false
    }
}
