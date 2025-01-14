package homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsWithLambda {
    public static void main(String[] args) {
        // Step 1: Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Avocado");
        strings.add("Cherry");
        strings.add("Apricot");
        strings.add("Blueberry");

        System.out.println("Original List: " + strings);

        // Step 2: Filter strings starting with "A" using a lambda expression
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        // Step 3: Print the filtered list
        System.out.println("Filtered List (starting with 'A'): " + filteredStrings);
    }
}
