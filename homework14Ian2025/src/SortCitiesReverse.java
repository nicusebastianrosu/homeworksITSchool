package homework09;

import java.util.List;
import java.util.stream.Collectors;

public class SortCitiesReverse {
    public static void main(String[] args) {
        // Create a list of cities
        List<String> cities = List.of("New York", "Athena", "Los Angeles", "Chicago", "Houston", "Phoenix", "Bucharest");

        // Sort the cities alphabetically in reverse order
        List<String> sortedCities = cities.stream()
                .sorted((city1, city2) -> city2.compareTo(city1))
                .collect(Collectors.toList());

        // Output the result
        System.out.println("Cities sorted in reverse alphabetical order:");
        sortedCities.forEach(System.out::println);
    }
}
