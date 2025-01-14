package homework05;

import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = List.of("apple", "banana", "cherry", "kiwi", "grape");

        // Concatenate all strings with a comma separator
        String concatenatedString = strings.stream()
                .collect(Collectors.joining(", "));

        // Output the result
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
