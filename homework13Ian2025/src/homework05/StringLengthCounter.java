package homework05;

import java.util.List;

public class StringLengthCounter {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = List.of("apple", "banana", "cherry", "kiwi", "grapefruit");

        // Count the number of strings longer than 5 characters
        long count = strings.stream()
                .filter(str -> str.length() > 5)
                .count();

        // Output the result
        System.out.println("Number of strings longer than 5 characters: " + count);
    }
}
