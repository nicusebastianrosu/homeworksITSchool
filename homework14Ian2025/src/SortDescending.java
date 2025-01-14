package homework05;

import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = List.of(5, 3, 8, 1, 9, 4, 6);

        // Sort the list in descending order using sorted()
        List<Integer> sortedNumbers = numbers.stream()
                .sorted((a, b) -> b - a) // Comparator for descending order
                .collect(Collectors.toList());

        // Output the result
        System.out.println("Sorted list in descending order: " + sortedNumbers);
    }
}
