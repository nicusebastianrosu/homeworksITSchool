package homework05;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = List.of("apple", "banana", "cherry", "kiwi", "grape");

        // Filter out strings containing the letter "a" and collect the remaining strings
        List<String> filteredStrings = strings.stream()
                .filter(str -> !str.contains("a"))
                .collect(Collectors.toList());

        // Output the result
        System.out.println("Strings without the letter 'a': " + filteredStrings);
    }
}
