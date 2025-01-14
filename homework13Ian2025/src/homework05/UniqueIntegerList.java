package homework05;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueIntegerList {
    public static void main(String[] args) {
        // Sample list of integers with duplicates
        List<Integer> numbers = List.of(1, 2, 3, 4, 4, 5, 2, 6, 7, 3, 7);

        // Create a list of unique integers using distinct()
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // Output the result
        System.out.println("List of unique integers: " + uniqueNumbers);
    }
}
